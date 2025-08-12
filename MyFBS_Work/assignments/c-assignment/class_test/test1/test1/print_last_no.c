#include<stdio.h>
void main()
{
	int no = 223410;
	int a;
	int b;
	int c;
	a = no%10;
	c = no/10;
	b = c%10;
	printf("%d%d",b,a);
}
	