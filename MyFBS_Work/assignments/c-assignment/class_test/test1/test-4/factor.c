//factor of number in given range
#include<stdio.h>
int main()
{
	int start,end;
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	printf("factor of numbers:");
	printf("\n");
 	for(int i = start; i<=end; i++)
 	{
	printf(" %d = ",i);
 	for(int j = 1; j<=i;j++)
		{
 			if(i % j == 0)
			{
 			printf("%d,",j);
	 		}
		}
 	printf("\n");
	}
	return 0;	
}