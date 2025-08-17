#include<stdio.h>

//fun decl
void agecheck();
int main(){
	//fun call
	agecheck();
}

//fun def
void agecheck()

{
	
	int age;
	
	printf("Enter the age:");
	scanf(" %d",&age);
	
	if(age<=12){
		printf("Child \n");
	}
	else if(age>=12 && age<=19){
		printf("Teenager \n");
	} 
	else if(age>=20 && age<=59){
		printf("Adult \n");
	}
	else if(age>=60){
		printf("Senior \n");
	}  
}