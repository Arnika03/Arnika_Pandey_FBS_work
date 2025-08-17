//swapping number
#include<stdio.h>
void swap(int*,int*);
void main()
{
	int a=10,b=20;
	printf("before swap number a= %d b= %d \n",a,b);
	swap(&a,&b);
	printf("after swap number a= %d b= %d \n",a,b);
	
}
void swap(int *x,int *y)
{
	int temp=*x;
	*x = *y;
	*y = temp;
}