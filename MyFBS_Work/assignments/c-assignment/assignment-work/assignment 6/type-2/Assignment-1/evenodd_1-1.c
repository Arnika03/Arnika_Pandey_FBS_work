#include<stdio.h>
int evenodd();
int main()
{
	
	if(evenodd())
	{
		printf("Number is even");
	}
	else
	{
		printf("Number is odd");	
	}
}
int evenodd()
{
	int	no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	if(no%2==0)
	{
		return 1;
	}
	else{
		return 0;
	}
	
}