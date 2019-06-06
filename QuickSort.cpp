
#include <iostream>
#include <stdio.h>
using namespace std;

void quickSort(int array[]){
	// int length = sizeof(*array);
	// cout << length << endl;
}

void printfArray(int array[]){

	
	 // for (i = 0; array[i]!=NULL; i++){
  //       printf("%s\n", array[i]);
  //   }
	 // cout << sizeof(array) << endl;
	// int *p;
	// p = array;
	// while(*p != '\0'){
	// 	cout << *p << endl;
	// 	p = p+1;
	// }
	// cout << &array << endl;
}

int main (){
	
	int array[] = {20,15,2,33,24,5,6,7,8,10};
	int length = sizeof(array) / sizeof(array[0]);
	cout << length << endl;

	quickSort(array);
	printfArray(array);
	return 0;
}