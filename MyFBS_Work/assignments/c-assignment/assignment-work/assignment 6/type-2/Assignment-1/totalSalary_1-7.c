#include<stdio.h>
double Salary();
int main()
{
	double totalSalary;
	totalSalary = Salary();
	printf("  Total Salary = %lf",totalSalary);
	return 0;
	
}
double Salary()
{
	double da,ta,hra;
	double  basic,totalSalary;
	
	printf("Enter basic Salary : ");
	scanf("%lf",&basic);
	
	if(basic<=5000)
	{
		da = basic*0.10;
		ta = basic*0.20;
		hra = basic*0.25;
		printf("da = %lf ta = %lf hra = %lf",da,ta,hra);
	}
	else
	{
		da = basic*0.15;
		ta = basic*0.25;
		hra = basic*0.30;
		printf("da = %lf ta = %lf hra = %lf",da,ta,hra);		
	}
	totalSalary = basic+da+ta+hra;
	return totalSalary;
}