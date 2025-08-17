#include<stdio.h>
//fun decl
void factorial();
void main()
{
	//fun call
	factorial();
}
//fun def
void factorial()
{
	int num = 5;
	int fact = 1;
	
	{
		for(int i = 1; i <= num; i++){
		fact = fact * i; 
	}
	printf("factorial of %d is %d\n ",num,fact);
	}
}