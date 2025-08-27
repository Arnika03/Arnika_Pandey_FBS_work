struct Admin
{
	int id;
	char name[30];
	double salary;
	double allowance;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct Admin admin1,admin2;
	
	admin1.id = 27;
	strcpy(admin1.name,"Purti");
	admin1.salary = 80000;
	admin1.allowance = 15000;
	
	printf("Enter Admin Details:");
	scanf("%d",&admin2.id);
	scanf("%s",&admin2.name);
	scanf("%lf",&admin2.salary);
	scanf("%lf",&admin2.allowance);
	
	printf("\nAdmin Details:\n");
	printf("\nId = %d",admin1.id);
	printf("\nName = %s",admin1.name);
	printf("\nSalary = %lf",admin1.salary);
	printf("\nAllowance = %lf \n",admin1.allowance);
	
	printf("\nId = %d",admin2.id);
	printf("\nName = %s",admin2.name);
	printf("\nSalary = %lf",admin2.salary);
	printf("\nAllowance = %lf",admin2.allowance);
}