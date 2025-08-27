struct Date 
{
	int date;
	int month;
	int year;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct Date  d1,d2;
	
	d1.date = 03;
	d1.month = 03;
	d1.year = 2002;
	
	printf("Enter Date Details:");
	scanf("%d",&d2.date);
	scanf("%d",&d2.month);
	scanf("%d",&d2.year);
	
	printf("\nDate Details:\n");
	printf("\nDate = %02d-%02d-%04d",d1.date,d1.month,d1.year);
	
	printf("\nDate = %02d-%02d-%04d",d2.date,d2.month,d2.year);
	
	return 0;
}