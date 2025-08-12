#include<stdio.h>
void main()
{
	int num = 4;
	
	for(int i=1; i<=num; i++){
		
		for(int j=1; j<=i; j++){
			
				printf("*");
  			}
		printf("\n\n");
			
	}
	for(int i = num-1; i>=1; i--){
		
		for(int j=1; j<=i; j++){
			
				printf("*");
  			}
		printf("\n\n");
			
	}
	
}