#include<stdio.h>
void main(){
	int num = 5;
	int fact = 1;
	
	{
		for(int i = 1; i <= num; i++){
		fact = fact * i; 
	}
	printf("factorial of %d is %d\n ",num,fact);
	}
}