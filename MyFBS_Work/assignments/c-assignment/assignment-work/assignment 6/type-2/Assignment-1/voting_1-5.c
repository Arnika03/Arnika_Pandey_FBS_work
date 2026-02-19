#include<stdio.h>
int voting();
int main()
{
	if(voting())
	{
		printf("Eligible for voting");
	}
	else
	{
		printf("Not-Eligible for voting");
	}
}
int voting()
{
	int age;
	
	printf("Enter age: ");
	scanf("%d",&age);
	
	if(age>=18)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}