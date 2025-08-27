struct employee
{
	int id;
	char name[30];
	double salary;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct employee e1,e2;
	
	e1.id = 07;
	strcpy(e1.name,"Arnika");
	e1.salary = 80000;
	
	printf("Enter Employee Details:");
	scanf("%d",&e2.id);
	scanf("%s",&e2.name);
	scanf("%lf",&e2.salary);
	
	printf("\nEmployee Details:\n");
	printf("\nId = %d",e1.id);
	printf("\nName = %s",e1.name);
	printf("\nSalary = %lf \n",e1.salary);
	
	printf("\nId = %d",e2.id);
	printf("\nName = %s",e2.name);
	printf("\nSalary = %lf",e2.salary);
	
	return 0;
}