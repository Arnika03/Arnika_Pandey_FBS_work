//perfect numbers in the given range
#include<stdio.h>
int main()
{
	int num,start,end;
	
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	for(int i = start; i<=end; i++)
 	{
 		int sum=0; 
 	for(int j = 1; j<i;j++)
		{
			if(i % j == 0)
			{
 			sum = sum + j;
	 		}
	 	}
		if(sum==i)
	 		printf("% is perfect number \n",sum);
	}
}