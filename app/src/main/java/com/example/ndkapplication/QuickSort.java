package com.example.ndkapplication;
public class QuickSort{

	public static void main(String[] args){
		// int[] array = new int[]{ 10, 4, 213, 5, 6236, 51, 2, 56, 7, 7, 6 };quickSort(array, 0,  3);

		// int[] array = new int[]{ 10, 4, 6, 5, 6236, 51, 2, 56, 7, 7,  213};

		// int[] array = new int[]{ 10, 4, 6, 5, 7, 51, 2, 56, 7, 6236,  213};

		// int[] array = new int[]{ 10, 4, 6, 5, 7, 7, 2, 56, 51, 6236,  213};
		
		quickSort(new int[]{ 4,7,6,5,3,2,8,1 });
		// printArray(array);
	}

	public static void quickSort(int[] array){
		quickSort(array, 0,  array.length-1);
		printArray(array);
	}

	public static void quickSort(int[] array, int start, int end){

		if(array.length==0 || start >= end){
			return;
		}

		//基准值，选在第一位
		int pivot = start;
		int pStart = start;
		int pEnd = end;


		int pivotValue = array[pivot];
		while(start < end){
			//交换法

			while(end > start && array[end] > pivotValue) {
				end = end - 1;	
			}

			while(start < end && array[start] <= pivotValue ) {
				start = start + 1;	
			}

			if(start != end){
				//交换start和end的值
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;		
				
			}else{
				
				int temp = array[pStart] ;
				array[pStart] = array[start];
				array[start] = temp;		
				break;
			}

		}

		// printArray(array);

		// System.out.println("start = "+start + " end =  "+end);
		if(pStart < start){
			quickSort(array, pStart,  start - 1);	
		}
		if(end < pEnd){
			quickSort(array, end+1, pEnd);		
		}
			
	}

	public static void printArray(int[] array){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<array.length ;i++){
			
			if(i< array.length-1){
				sb.append(array[i]+", ");
			}else{
				sb.append(array[i]);
			}
		}

		System.out.println("print: "+sb.toString());
	}
}