struct HR 
{
	int id;
	char name[40];
	double salary;
	double commission;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct HR hr1,hr2;
	
	hr1.id = 27;
	strcpy(hr1.name,"Purti");
	hr1.salary = 80000;
	hr1.commission = 20000;
	
	printf("Enter HR Details:");
	scanf("%d",&hr2.id);
	scanf("%s",hr2.name);
	scanf("%lf",&hr2.salary);
	scanf("%lf",&hr2.commission);
	
	printf("\nHR Details:\n");
	printf("\nId = %d",hr1.id);
	printf("\nName = %s",hr1.name);
	printf("\nSalary = %.2lf",hr1.salary);
	printf("\nCommission %.2lf \n",hr1.commission);
	
	printf("\nId = %d",hr2.id);
	printf("\nName = %s",hr2.name);
	printf("\nSalary = %.2lf",hr2.salary);
	printf("\nCommission %.2lf",hr2.commission);
	
	return 0;
}