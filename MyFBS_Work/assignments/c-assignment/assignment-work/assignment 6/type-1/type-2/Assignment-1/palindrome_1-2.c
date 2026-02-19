#include<stdio.h>
int palindrome();
int main()
{
	if(palindrome())
	{
		printf("Number is Palindrome");
	}
	else
	{
		printf("Number is not Palindrome");
	}
}
int palindrome()
{
	int no,res,p,q,r,s;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	p=no%10;
	q=no/10;
	r=q%10;
	s=q/10;
	
	res =p*100+r*10+s;
	
	if(res==no)
	{
		return 1;
	}
	else
	{
		return 0;
	}

	
	
	
}