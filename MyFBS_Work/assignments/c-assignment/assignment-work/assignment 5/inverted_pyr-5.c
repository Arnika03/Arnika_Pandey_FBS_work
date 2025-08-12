#include<stdio.h>
void main()
{
	int num = 5;
	
	for(int i = 1; i <= num; i++){
		
		for(int j = 1; j <= i; j++){
			
				printf(" ");
  			}
  			
  			for (int k = 5; k >= i ; k--) {
            printf("* ");
        }

		printf("\n\n");	
	}
		
}