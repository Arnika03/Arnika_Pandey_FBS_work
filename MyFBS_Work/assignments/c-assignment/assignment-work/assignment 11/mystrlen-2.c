//strlen function as user define
#include<stdio.h>
int mystrlen(char*);
int main()
{
 char*str= "arnika";
 int len = mystrlen(str);
 
 printf("string length is %d",len);
 return 0;
}
int mystrlen(char*ptr)
{
	int i = 0;
	while(ptr[i]!='\0'){
		i++;
	}
	return i;	
}