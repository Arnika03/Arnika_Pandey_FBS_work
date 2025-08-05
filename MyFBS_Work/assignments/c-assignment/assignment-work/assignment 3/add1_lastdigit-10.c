#include<stdio.h>
void main(){
	int num = 12345;
	int rem,sum,lastd;
	
	lastd  = num % 10;
	
	while(num>0){
		
		rem = num % 10;
		num = num / 10;
		}
		sum = rem + lastd;
		printf("Sum of first and last digit is: %d\n (%d + %d)", sum,rem,lastd);
}