#include<stdio.h>
void main(){
	int num1,num2,num3;
	printf("num1 :");
	scanf(" %d",&num1);
	
	printf("num2 :");
	scanf(" %d",&num2);
	
	printf("num3 :");
	scanf(" %d",&num3);
	
	
	if(num1>num2){
		if(num1>num3){
		printf("num1 is greater= %d");
	}
	else{
			printf("num3 is greater= %d");
	}
}
	else{
		if(num2>num3){
				printf("num2 is greater= %d");
		}
	}
	


}