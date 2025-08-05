#include<stdio.h>
void main(){
	double price,total_prise,discount=0;
	char student;
	
	printf("Enter purchase price :");
	scanf(" %lfd",&price);
	
	printf("Are you a student? (y/n):");
	scanf(" %c",&student);
	
	
	if(student=='y'){
	if(price>500){
		discount = price*20/100;
		total_prise = price - discount;
	printf("the final price %lf when discount is %lf",total_prise,discount);
	}
	else{
		discount = price*10/100;
		total_prise = price - discount;
		printf("the final price %lf when discount is %lf",total_prise,discount);
	}
}
	if(student=='n'){
		if(price>600){
		discount = price*15/100;
		total_prise = price - discount;
		printf("the final price %lf when discount is %lf",total_prise,discount);
	}
	else{
		printf("there is no discount");
		
	}
	}
}
