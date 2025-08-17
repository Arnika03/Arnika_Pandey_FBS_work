// minimum and maximum number in array
#include<stdio.h>
int main()
{
	int	min,max;
	int a[5]={32,23,44,56,28};
	min = max = a[0];
	
	for(int i=1; i<5;i++){
			//condition check for minimum number
			if  (a[i]<min){
			 	min = a[i];
			}
			//condition check for maximum number
			if(a[i]>max){
			 	max = a[i];
			}
	}
	printf("minimum number in array %d \n",min);
	printf("maxmium number in array %d",max);
	
	return 0;
}