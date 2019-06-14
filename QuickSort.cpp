#include <iostream>
#include <stdio.h>
using namespace std;


/**
* 快速排序：C++ 实现
* 1 选择数组第一位，作为基准值（基准值可以随意选，random函数更佳）
* 2.1 根据函数的start end，确定排序范围
* 2 2 左指针找到比基准值大的数字，停止
* 2.3 右指针找到比基准值小的数字，停止
* 2.4 左右指针指向的值，交换， 继续 2.2 - 2.4的步骤
* 3 当左右指针相等时，该轮排序完毕，基准值与指针值交换
* 4 根据指针位置， 并进行下一轮分治递归 （指针位置，左边递归，右边递归，具体参考函数）
* 
* 平均时间复杂度 ： O(nlogn),  最坏情况：每一轮基准值都是最大、最小值，O(n2)
*/
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