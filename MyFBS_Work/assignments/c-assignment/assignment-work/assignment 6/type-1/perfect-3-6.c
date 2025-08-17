#include<stdio.h>
//fun decl
void perfect();
void main(){
	//fun call
	perfect();
}

//fun decl
void perfect()
{
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