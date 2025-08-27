//strchr function
#include<stdio.h>
char* mystrchr(char*,char);
void main()
{
	char str[] = "arnika";
	char* res = mystrchr(str,'a');
	
	if(*res!='\0'){
		printf("character is found  \n");
		printf("character is found in %d index",res-str);
	}
	else
		printf("character is not found");
}

char* mystrchr(char*ptr,char ch)
{
	int i = 0;
	while(ptr[i]!='\0'){
		if(ptr[i] == ch)
		return &ptr[i];
		
		i++;
	}
	return '\0';		
}