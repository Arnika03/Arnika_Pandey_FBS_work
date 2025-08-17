//odd and even among the numbers
#include<stdio.h>
void alternum(int[],int);
int main(){
	int arr[10]={10,20,30,40,50,60,70,80,90,100};
	int num;
	alternum(arr,num);
	return 0;
}
void alternum(int arr[],int num)
{
	for(int i=1; i<10;i+=2)
		printf("alternate number %d \n",arr[i]);
}