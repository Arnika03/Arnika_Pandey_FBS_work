//odd and even among the numbers
#include<stdio.h>
int main(){
	int arr[5]={10,20,30,40,50};
	int num;
	for(int i=1; i<5;i+=2)
		printf("alternate number %d \n",arr[i]);
	return 0;
}