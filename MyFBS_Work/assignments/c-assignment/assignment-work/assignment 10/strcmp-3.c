//strcmp function for comparing strings
#include<stdio.h>
#include<string.h>
void main()
{
 char* str1 = "apple";
 char* str2 = "application";
 
 int res = strcmp(str1,str2);
 
 printf("result is = %d",res);	
}