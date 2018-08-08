#include "datadef.h"
#include "myalgos.h"
void mySwap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
	return;
}

/*int partition(int arr[], int low, int high){
	int i=low,j=high;
	int pivot=arr[high];
	while(i<j){
		while(i<=high && (arr[i]<pivot)){
			i++;
		}
		while(j>=low && (arr[j]>=pivot)){
			j--;
		}
		mySwap(&arr[i],&arr[j]);
	}
	return i;
}*/

int partition (int arr[], int low, int high)
{
    int pivot = arr[high];    // pivot
    int i = (low - 1);  // Index of smaller element
 
    for (int j = low; j <= high- 1; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (arr[j] <= pivot)
        {
            i++;    // increment index of smaller element
            mySwap(&arr[i], &arr[j]);
        }
    }
    mySwap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

void quickSortRecursive(int arr[], int low, int high){
	if(low < high){
		int p = partition(arr,low,high);
		quickSortRecursive(arr,low,p-1);
		quickSortRecursive(arr,p+1,high);		
	}
	return ;
}

void quickSort(int arr[], int arraySize){
	quickSortRecursive(arr, 0, arraySize);
	return ;
}

void _insertionSortUtil(int arr[],int low,int high){
	int i=0,j=0,key;
	for(i=1;i<high;i++){
		key=arr[i];
		j=i-1;
		while(j>=0 && arr[j]>key){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	return;
}
void insertionSort(int arr[], int arraySize){
	return _insertionSortUtil(arr,0,arraySize-1);
}
