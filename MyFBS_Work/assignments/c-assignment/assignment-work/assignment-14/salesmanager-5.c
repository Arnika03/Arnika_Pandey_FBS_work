struct SalesManager 
{

	int id;
	char name[40];
	double salary;
	double incentive;
	double target;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct SalesManager m1,m2;
	
	m1.id = 27;
	strcpy(m1.name,"Purti");
	m1.salary = 50000;
	m1.incentive = 5000;
	m1.target = 150000;
	
	printf("Enter SalesManager Details:");
	scanf("%d",&m2.id);
	scanf("%s",m2.name);
	scanf("%lf",&m2.salary);
	scanf("%lf",&m2.incentive);
	scanf("%lf",&m2.target);
	
	printf("\nSalesManager Details:\n");
	printf("\nId = %d",m1.id);
	printf("\nName = %s",m1.name);
	printf("\nSalary = %.2lf",m1.salary);
	printf("\nIncentive = %.2lf",m1.incentive);
	printf("\nTarget = %.2lf \n",m1.target);
	
	printf("\nId = %d",m2.id);
	printf("\nName = %s",m2.name);
	printf("\nSalary = %.2lf",m2.salary);
	printf("\nIncentive = %.2lf",m2.incentive);
	printf("\nTarget = %.2lf",m2.target);
	
	return 0;
}