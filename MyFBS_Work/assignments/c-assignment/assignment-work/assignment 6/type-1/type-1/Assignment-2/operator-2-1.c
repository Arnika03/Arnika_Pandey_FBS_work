#include<stdio.h>
 //fun decl
void operatoruse();
void main(){
	//fun call
	operatoruse();
}

//fun def
void operatoruse()

{
	int num1,num2;
	char oper;
	
	printf("first number:");
	scanf(" %d",&num1);
	
	printf("second number:");
	scanf(" %d",&num2);
	
	printf("operator(+,-,/,*,%):");
	scanf(" %c",&oper);
	
	if(oper == '+'){
		printf("addition of both numbers= %d \n",num1+num2);
	}
	else if(oper== '-'){
		printf("subtraction of both numbers= %d \n",num1-num2);
	} 
	else if(oper== '/'){
		printf("division of both numbers= %d \n",num1/num2);
	}
	else if(oper== '*'){
		printf("multiplication of both numbers= %d \n",num1*num2);
	}  
	else if(oper== '%'){
		printf("modulo of both numbers= %d \n",num1%num2);
	} 
	else{
		printf("operator is not available");
	}
	
}