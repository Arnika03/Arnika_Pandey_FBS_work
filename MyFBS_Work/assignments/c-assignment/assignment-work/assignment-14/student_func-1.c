#include<stdio.h>
#include<string.h>
struct Student{
	int rollNo;
	char name[20];
	int marks;
};
struct Student storeStudent();//fun decl
void displayStudent(struct Student);//fun decl
void main(){
	//Student (rollNo, name, marks) 
	struct Student s1,s2;
	
	printf("Enter the details of S1:\n");
	s1=storeStudent();
	printf("Enter the details of S2:\n");
	s2=storeStudent();
	
	printf("\nEntered Student details: \n");
	displayStudent(s1);//fun call
	displayStudent(s2);//fun call	
}

struct Student storeStudent()//fun def
{
	struct Student temp;
	scanf("%d",&temp.rollNo);
	scanf("%s",temp.name);
	scanf("%d",&temp.marks);
	return temp;
}

void displayStudent(struct Student std)//fun def
{	
	printf("\nRoll No. : %d || Name: %s || Marks: %d",std.rollNo,std.name,std.marks);
}