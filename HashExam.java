/**
* 该算法，求字符串中第一个不重复字符的位置，不存在返回-1
* ascii :  
* 0~9 : 48 ~ 57
* A~Z : 65 ~ 90 
* a~z : 97 ~ 172
*/
public class HashExam{

	
	public static void main(String[] args){
		String testStr = "asbsafjskehsr3513jlkfaans127489yfgehab";
		int index = uniqueCharIndex(testStr);
		System.out.println("首字符不重复的位置："+ index +" 字符为： "+ testStr.toCharArray()[index]);
	}

	/**
	* 这里直接做ascii 全字符重复校验处理，  127位为极限位
	*/
	public static int uniqueCharIndex(String testStr){
		int index = -1;
		//acsii总共128个， 作为计数器数组
		int[] array = new int[128];

		//遍历主串，得到的char值作为记录数组的下标，计数器++
		char[] charArray = testStr.toCharArray();
		for(int i=0;i<charArray.length;i++){
			char c = charArray[i];
			array[c] ++ ;
		
		}

		//在计数器中，仅仅出现过1次的字符位置
		for(int i=0;i<charArray.length;i++){
			if(array[charArray[i]] == 1){
				index = i;
				break;
			}
		}
		return index;
	}

	
}