//find common element
#include<stdio.h>
int maxinum(int[]);
int main()
{
	int arr[6];

	
	printf("enter the element in array:");
	for(int i=0; i<6; i++)
	scanf("%d",&arr[i]);
	maxinum(arr);
	return 0;
}
int maxinum(int arr[])
{

	int i=0;
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

}