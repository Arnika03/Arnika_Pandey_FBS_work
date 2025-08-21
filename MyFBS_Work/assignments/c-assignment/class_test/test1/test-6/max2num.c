//find common element
#include<stdio.h>
int main()
{
	int arr[5];
	
	int i=0;
	printf("enter the element in array:");
	for(i=0; i<6; i++)
	scanf("%d",&arr[i]);
	
	printf("maximum number in array: \n");
	{
	int max = arr[0];
	for( i=0; i<6; i++)
	{
		
		if(arr[i]>max)
			{
			max = arr[i];
			}
	}
			printf("first maximum number in array :%d\n",max);
			
}
{
	int max = arr[0];
	for( i=0; i<5; i++)
	{
		
		if(arr[i]>max)
			{
			max = arr[i];
			}
	}
			printf("second maximum number in array :%d",max);
	
		printf("\n");
}
	return 0;
}