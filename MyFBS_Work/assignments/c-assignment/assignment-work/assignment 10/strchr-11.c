//strchr function
#include<stdio.h>
#include<string.h>
void main()
{
	char str[] = "arnika";
	char* res = strchr(str,'a');
	if(*res!='\0'){
		printf("character is found  \n");
		printf("character is found in %d index",res-str);
	}
	else
		printf("character is not found");	
}