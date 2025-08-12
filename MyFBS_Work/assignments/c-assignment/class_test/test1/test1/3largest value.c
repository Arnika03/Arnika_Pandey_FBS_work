#include<stdio.h>
void main()
{
	int a= 30, b= 50, c= 80;
	
	if(a>b){
	if(a>c){
		printf("a is greater");
	}
	else{
		printf("c is greater");
	}
	} 
	else{
		if(b>c){
			printf("b is greater");
		}
		else{
			printf("c is greater");
		}
	}
}