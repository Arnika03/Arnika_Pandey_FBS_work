#include<stdio.h>
void main()
{
	int num = 4;
	
	for(int i = 1; i <= num; i++){
		
		for(int j = 1; j <= num; j++){
			if(i==1 || i==4 ||j==1 || j==4){
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
