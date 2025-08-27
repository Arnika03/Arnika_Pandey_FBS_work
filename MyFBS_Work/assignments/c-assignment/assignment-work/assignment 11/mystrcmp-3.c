//user define function- mystrcmp function for comparing strings
#include<stdio.h>
int mystrcmp(char*,char*);
void main()
{
 char* str1 = "apply";
 char* str2 = "application";
 
 int res = mystrcmp(str1,str2);
 
 printf("result is = %d",res);	
}
int mystrcmp(char* str1,char* str2)
{
	int i = 0;
	
	while (str1[i] !='\0' && str2[i] !='\0')
	{
	
	if(str1[i]!=str2[i])
		{
		if(str1[i]>str2[i])
			return 1;
		else
			return -1; 	
		}
		i++;
	}
		return 0;  
}