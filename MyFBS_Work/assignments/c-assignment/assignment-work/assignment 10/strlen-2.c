//counting length without function
#include<stdio.h>
void main()
{
	char str[]="firstbit";
	int i=0;
		while(str[i]!='\0'){
			i++;
		}
		printf("the length of string is %d",i);
}