#include<stdio.h>
int vowcons();
int main()
{
	if(vowcons())
	{
		printf("Character is vowel");
	}
	else
	{
		printf("Character is Consonant");
	}
}
int vowcons()
{
	char ch;
	
	printf("Enter Character: ");
	scanf("%c",&ch);
	
	if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || 
	ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}