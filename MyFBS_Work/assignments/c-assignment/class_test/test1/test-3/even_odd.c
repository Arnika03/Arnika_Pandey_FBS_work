//print even and odd number
#include<stdio.h>
void main()
{
	int num,start,end;
	
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	printf("even numbers:");
	printf("\n ");
	for(num=start;num<=end;num++){
		if(num%2==0){
			printf("%d ",num);
			}	
	}
	printf("\n");
	printf("odd numbers:");
	printf("\n ");
	for(num=start;num<=end;num++){
		if(num%2==1){
			printf("%d ",num);
		}	
	}
	
}