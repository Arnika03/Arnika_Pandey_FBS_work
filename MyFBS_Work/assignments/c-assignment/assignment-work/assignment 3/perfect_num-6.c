#include<stdio.h>
void main(){
	int num = 15;
	int sum = 0;
	
		for(int i = 1; i < num; i++)
		{
			if( num % i == 0){
			sum += i;
			
			}
			
		}
	
	   if(sum == num){
		printf("%d number is perfect no\n",num);
	   }
	   else{
	   	printf("%d number is not perfect no\n",num);
	   }
}