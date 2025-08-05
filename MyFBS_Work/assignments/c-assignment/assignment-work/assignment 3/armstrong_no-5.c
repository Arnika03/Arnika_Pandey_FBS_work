#include<stdio.h>
void main(){
	int num = 153 , temp , rem , sum = 0;
	temp = num;
	
	while(temp!=0){
	
	rem = temp % 10;
	sum = sum + rem * rem * rem;
	temp = temp / 10;
}

	 if(sum == num){
	 	 printf("number is Armstrong\n");
	 }else{
	 	 printf("number is not Armstrong\n");
	 }
}