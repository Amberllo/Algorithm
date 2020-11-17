package com.example.ndkapplication;
/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 7, 2, 8, 6, 9, 1};
        System.out.print("排序前：");
        printArray(array);
        insertionSort(array, 0);
        System.out.print("排序结果：");
        printArray(array);
    }


    public static void insertionSort(int[] array, int index) {
    	int indexPosition = index;
    	int indexValue = array[index];

        System.out.print("第" + (index + 1) + "轮：index = " + index + " indexValue = " + array[index] + "\n");
        if (index >= 1) {
            for (int i = index - 1; i >= 0; i--) {

                if (array[indexPosition] < array[i]) {
                    System.out.print("交换" + array[indexPosition] + " 和 " + array[i] + "\n");
                    int temp = array[indexPosition];
                    array[indexPosition] = array[i];
                    array[i] = temp;
                    indexPosition = i;
                }
            }
        }

        printArray(array);
        if (index + 1 < array.length) {
            insertionSort(array, index + 1);
        }

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("");
    }
}