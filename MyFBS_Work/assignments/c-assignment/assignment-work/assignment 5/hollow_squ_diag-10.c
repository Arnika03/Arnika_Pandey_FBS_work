#include<stdio.h>
void main()
{
	int num = 5;
	
	
	for(int i = 1; i <= num; i++){
		
		for(int j = 1; j <= num; j++){
			if(i==1 || i==5 ||j==1 || j==5 || i==j){
					printf("* ");
			}
		else
		{
		printf("  ");	
		}
				
	}
	printf("\n\n");
	}
}
