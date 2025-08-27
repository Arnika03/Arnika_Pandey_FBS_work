//strchr function
#include<stdio.h>
#include<string.h>
char* mystrrchr(char*,char);
void main()
{
	char str[] = "arnika";
	char* res = mystrrchr(str,'a');
	
	if(*res!='\0'){
		printf("character is found  \n");
		printf("character is found in %d index",res-str);
	}
	else
		printf("character is not found");
}

char* mystrrchr(char*ptr,char ch)
{
	int len = strlen(ptr);
	int i = len-1;
	while(ptr[i]!='\0'){
		if(ptr[i] == ch)
		return &ptr[i];
		
		i--;
	}
	return '\0';		
}