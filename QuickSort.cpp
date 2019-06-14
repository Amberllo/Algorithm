#include <iostream>
#include <stdio.h>
using namespace std;

void printfArray(int array[],int length){

	for(int i=0;i<length; i++){
		printf("%d,", array[i]);
	}	
}

void quickSort(int array[], int start, int end){

	if(start == end){
		return;
	}
	printf("递归开始：");
	printfArray(array,10);
	printf("start = %d, end = %d, ",start, end);
	printf("\n");

	int pivot = start;//选择基准值
	int startIndex = start;
	int endIndex = end;

	while( startIndex < endIndex){
		
		while(startIndex < endIndex && array[endIndex] > array[pivot]){
			endIndex = endIndex - 1 ;
		}

		while(startIndex < endIndex && array[startIndex] <= array[pivot]){
			startIndex = startIndex+1 ;
		}
			
		if(startIndex != endIndex){
			int temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] =  temp;
		} else {
			int temp = array[pivot];
			array[pivot] = array[startIndex];
			array[startIndex] =  temp;

			quickSort(array, start, startIndex-1);
			quickSort(array, endIndex+1, end);

		}
	}
	
}


int main (){
	
	int array[] = {20,15,2,33,24,5,6,7,8,10};
	int length = sizeof(array) / sizeof(array[0]);
	quickSort(array, 0, length-1);
	printf("最终结果：");
	printfArray(array, length);

	return 0;
}