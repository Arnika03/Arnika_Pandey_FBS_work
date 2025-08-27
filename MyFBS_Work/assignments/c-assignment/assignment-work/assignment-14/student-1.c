struct student
{
	int rollno;
	char name[30];
	double marks;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct student s1,s2;
	
	s1.rollno = 307;
	strcpy(s1.name,"ArnikaPandey");
	s1.marks = 95;
	
	printf("student's Details :");
	scanf("%d",&s2.rollno);
	scanf("%s",&s2.name);
	scanf("%lf",&s2.marks);
	
	printf("\nstudent's information:\n");
	printf("\nRollNo = %d",s1.rollno);
	printf("\nName = %s",s1.name);
	printf("\nMarks = %lf",s1.marks);
	
	printf("\nRollNo = %d",s2.rollno);
	printf("\nName = %s",s2.name);
	printf("\nMarks = %lf",s2.marks);
}