//addition of alternate numbers
#include<stdio.h>
void main()
{
	int num,start,end,sum=0;
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	printf("addition of alternate numbers:");
	printf("\n ");
	for(int num=start;num<=end;num++){
		if(num%2==1)
		sum = sum + num;
	}
	printf("%d",sum);
	
}