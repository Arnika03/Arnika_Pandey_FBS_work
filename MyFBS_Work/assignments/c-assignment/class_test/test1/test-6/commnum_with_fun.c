//find common element
#include<stdio.h>
int	commnum(int[],int[]);
int main()
{
	int arr[6];
	int brr[6];
	
	
	printf("enter the element in first array:");
	for(int i=0; i<6; i++)
	scanf("%d",&arr[i]);
	
	printf("enter the element in second array:");
	for(int j=0; j<6; j++)
	scanf("%d",&brr[j]);
	
	commnum(arr,brr);
	return 0;
}
int	commnum(int arr[],int brr[])
{
	int found = 0;	
	printf("common number in array:");
	for(int i=0; i<6; i++)

	{
		for(int j=0; j<6; j++){
				if(arr[i]==brr[j])
			{
				printf("%d ",arr[i]);
				found = 1;
			}
		}
			
	}
	if(found==0){
		printf("no common number in array ");
	}
	printf("\n");
}