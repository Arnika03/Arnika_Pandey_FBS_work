#include<stdio.h>
void main()
{
	int bio = 89,
	phy = 85,
	chem = 82,
	hindi = 96,
	eng = 75,
	total,
	per;
	
	total = bio + phy + chem + hindi + eng;
	per = total/5;
	printf("  total marks = %d  ",total);
	printf("persentage = %d",per);
}