#include<stdio.h>
void main()
{
	int a,b,c;
	a = 10;
	b = 7;
	
	c = a+b;
	a = c-a;
	b = c-b;
	
	printf("swapping of two numbers %d %d",a,b);
}