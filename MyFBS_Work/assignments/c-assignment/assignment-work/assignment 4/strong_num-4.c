//strong numbers in the given range
#include<stdio.h>
int main()
{
	int start,end;
	int sum=0;
	
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	for(int num = start; num<=end; num++)
 	{
 		int temp = num;
        int sum = 0;
        
    while(temp > 0) {
        int digit = temp % 10;
        
        int fact = 1;
        for(int i = 1; i<=digit;i++){
        fact = fact * i;
		}
 		sum = sum + fact;
 		temp = temp / 10;
	}
		if(sum == num) {
            printf("%d is a Strong Number\n", num);
        }
}
	return 0;
}