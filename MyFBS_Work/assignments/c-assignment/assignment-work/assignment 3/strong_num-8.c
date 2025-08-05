#include<stdio.h>
void main(){
	int num = 145;
	int fact,r,sum=0;
	int temp = num;
	
	while(temp != 0){
		fact = 1;
		r = temp % 10;
		
		for(int i = 1; i<=r;i++){
			
			fact = fact * i;
		}
		sum = sum + fact;
		temp = temp / 10;
	}
	if(sum==num){
		printf("number is Strong number\n")
	}
	else{
	 	 printf("number is not Strong number\n");
	 }
	
}