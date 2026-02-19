#include<stdio.h>
char charcase();

int main()
{
	char res;
	res = charcase();
	
	if(res=='U')
	{
		printf("Character is Upercase");
	}
	else
	{
		printf("Character is Lowercase");	
	}	
}
char charcase()
{
	char ch;
	
	printf("Enter Character: ");
	scanf(" %c", &ch);
	
	if(ch >= 'A' && ch <= 'Z')
	{
		return 'U';
	}
	else
	{
		return 'L';
	}
}