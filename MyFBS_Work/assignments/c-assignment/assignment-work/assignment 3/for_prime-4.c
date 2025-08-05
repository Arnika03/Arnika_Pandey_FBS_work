#include<stdio.h>
void main(){
	int no = 7,
	flag = 0;
	int i=2;
	
	for(int i =2; i<= no/2 ;i++){
		if(no%i==0){
			flag=1;
			break;
		}
}
		if(flag==0){
			printf("no is  prime  \n");
		}
		else{
			printf("no is not prime \n");
		}	
	
}