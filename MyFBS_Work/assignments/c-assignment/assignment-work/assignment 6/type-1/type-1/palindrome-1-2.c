#include<stdio.h>
//function declration
void palindrome();
void main()
{
	//function call
	palindrome();
}
	//function definition
	void palindrome()
	
	{
		int no = 232,
	a = no%10,
	n1 = no/10,
	b = n1%10,
	c = n1/10,
	rev = a*100+b*10+c;
	
	if(no==rev){
		printf("this is a palindrome no");
	}
	else{
		printf("this is not a palindrome no");
	}
	
}