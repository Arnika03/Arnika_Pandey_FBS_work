#include<stdio.h>
void main()
{
	int Minute,hr,min;
	
	Minute = 336;
	hr = Minute/60;
	min = Minute%60;
	
	printf("hr=%d and min=%d",hr,min);
}