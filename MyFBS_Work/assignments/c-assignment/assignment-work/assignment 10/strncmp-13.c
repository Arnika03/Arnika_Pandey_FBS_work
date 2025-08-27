//strcmp function for comparing strings
#include<stdio.h>
#include<string.h>
void main()
{
 char* str1 = "apple";
 char* str2 = "application";
 char* n;
 int res = strncmp(str1,str2,5);
 
 printf("result is = %d",res);	
}