//strcat function as user define
#include<stdio.h>
char* mystrcat(char*,char*);
int main()
{
 char str1[7]="arnika";
 char str2[20]="pandey";
  
	mystrcat(str1,str2);
 
 printf("concatenated string %s",str1);
 return 0;
}
char* mystrcat(char*ptr1,char*ptr2)
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