#include<stdio.h>
int leapYear();
int main()
{
	if(leapYear())
	{
		printf("This Year is Leap Year");
	}
	else
	{
		printf("This Year is Not a Leap Year");
	}	
		
}

int leapYear()
{
	int year;
	
	printf("Enter Year: ");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}