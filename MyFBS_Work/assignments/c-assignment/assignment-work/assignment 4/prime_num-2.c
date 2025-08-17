//prime numbers in the given range
#include<stdio.h>
int main()
{
	int num,start,end,flag=1;
	
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	for (int num=start; num<=end; num++)
	{
	
		// num is prime
		flag = 1;
		
		if(num<2){
			//num is not prime
			flag = 0;
		}
	
		for (int i=2; i<=num/2; i++)
	{
		if(num%i==0){
			flag=0;
			break;
		}
					
	}
	if(flag==1){
			printf("%d is prime \n",num);
		}
	}
	return 0;
}
