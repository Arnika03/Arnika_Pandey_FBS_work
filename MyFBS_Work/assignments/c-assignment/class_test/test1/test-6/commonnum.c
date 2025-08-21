//find common element
#include<stdio.h>
void main()
{
	int arr[6];
	int brr[6];
	int found = 0;
	int i,j;
	printf("enter the element in first array:");
	for(i=0; i<6; i++)
	scanf("%d",&arr[i]);
	
	
	printf("enter the element in second array:");
	for( j=0; j<6; j++)
	scanf("%d",&brr[j]);
	
	printf("common number in array:");
	for( i=0; i<6; i++)

	{
		for(j=0; j<6; j++){
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