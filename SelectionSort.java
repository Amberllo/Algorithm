 /**
 * 选择排序算法
 * 每次从数组中，选择最小的元素，放在数组的顶端，index+1进行递归
 * 时间复杂度:  O( n + (n-1)+(n-2)+... 0 ) = O( n(n-1)/2 )
 */
public class SelectionSort{
	public static void main(String[] args){
		int[] array = new int[]{123, 45, 6, 1, 2, 56, 67, 324, 124, 2, 44};
		System.out.print("排序前：");
		printArray(array);
		selectionSort(array, 0);
		System.out.print("排序结果：");
		printArray(array);
		
		
	}

	public static void selectionSort(int[] array, int index){
		int minPosition = index;
		for(int i=index;i<array.length;i++){
			if(array[i] < array[minPosition]){
				minPosition = i;
			}

		}
		if(array[minPosition] != array[index] ){
			System.out.println("交换："+array[minPosition] +" 和 "+ array[index]);
			int temp = array[index];
			array[index] = array[minPosition];
			array[minPosition] = temp;	

		}

		System.out.print("递归：");
		printArray(array);
		if(index < array.length -1 ){
			selectionSort(array, index+1);	
		}

		
	}

	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println("");
	}

}