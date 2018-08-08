#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include "myUtils.h"
#include "myalgos.h"

int main(){
	printf("Inside main\n");
	int sample_size = getNum(1000,100000);
	printf("Sample size->%d\n",sample_size);
	int arr1[sample_size];
	int arr2[sample_size];
	printf("Generating sample\n");
	generateLoad(arr1,sample_size);
	generateLoad(arr2,sample_size);
	printf("Sample generated\n");
	int i=0;
	for(i=0;i<sample_size;i++){
		arr2[i]=arr1[i];
	}
	clock_t t_qSort,t_iSort;
    
    t_iSort = clock();
    insertionSort(arr1,sample_size);
    t_iSort = clock() - t_iSort;
    double time_taken_iSort = ((double)t_iSort)/CLOCKS_PER_SEC; // in seconds
 	printf("Insertion Sort took %f seconds to execute \n", time_taken_iSort);
    
    t_qSort = clock();
    quickSort(arr2,sample_size);
    t_qSort = clock() - t_qSort;
    double time_taken_qSort = ((double)t_qSort)/CLOCKS_PER_SEC; // in seconds
 
    printf("Quick Sort took %f seconds to execute \n", time_taken_qSort);
    
    return 0;
}