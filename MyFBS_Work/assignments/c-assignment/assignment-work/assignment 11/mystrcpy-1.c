//strcpy function as user define
#include<stdio.h>
char* mystrcpy(char*,char*);
int main()
{
 char str1[7]="arnika";
 char str2[20];
  
	mystrcpy(str1,str2);
 
 printf("string %s",str1);
 return 0;
}
char* mystrcpy(char*dest,char*src)
{
	
	char*tstr = ptr1;
	while(*tstr!='\0')
	tstr++;
	
	while(*ptr2!='\0'){
	*tstr = *ptr2;
		tstr++;
		ptr2++;
	}
	*tstr = '\0';
	return ptr1;	
}