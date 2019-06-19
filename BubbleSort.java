
/**
* 冒泡排序：
* 双循环遍历数组，每轮对比相邻两位的值，下一轮遍历进行索引衰减。
* 当在其中一轮，没任何的交换动作，即为排序完成。
* 时间复杂度,目标顺序：从小到大。
	最好情况：当前顺序: 从小到大，时间复杂度为 O(n), 
	最坏情况：当前顺序: 从大到小，时间复杂度 O(n平方)
*/
public class BubbleSort{
	public static void main(String[] args){
		int array[] = new int[]{5,9,3,1,2,8,4,7,6};
		bubbleSort(array);
	}

	public static void bubbleSort(int[] array){

		for(int i=0;i<array.length;i++){
			boolean hasChange = false;
			for(int j = array.length-1; j>0; j--){


				if(array[j]<array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp; 
					hasChange = true;
				}
			}	

			printArray(array);
			if(!hasChange){
				break;
			}
		}
		
	}

	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+", ");
		}
		System.out.println("");
	}

}