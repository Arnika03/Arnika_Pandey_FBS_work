#include<stdio.h>
//function decl
void voting();
void main(){
	
	//function call
	voting();
}

	//function def
	void voting()
{
	int age = 34;
	
	if(age>18){
	
	printf("%d eligible for voting",age);
	}
	
	else{
		printf("%d not eligible for voting",age);
	}
}