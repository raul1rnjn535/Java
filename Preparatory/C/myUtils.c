#include<stdio.h>
#include<stdlib.h>

int getNum(int lower, int upper){
	return ((rand() % (upper - lower + 1)) + lower);
}
void generateLoad(int arr[],int n){
	srand(1);
	int i=0;
	for(i=0;i<n;i++){
		arr[i] = rand();
	}
	return ;
}
void myPrintArr(int arr[], int arraySize){
	int i=0;
	for(i=0;i<arraySize;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	return;
}
