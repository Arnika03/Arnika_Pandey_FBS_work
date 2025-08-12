#include<stdio.h>
void main()
{
 int hh,min,sec;
 hh = 3;
 min = 34;
 sec = 16;
 
min = hh*60+min;
sec = min*60+sec;

printf("total second is = %d",sec);
}