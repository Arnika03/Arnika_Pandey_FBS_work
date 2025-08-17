//Search the given number in array
#include<stdio.h>
int main()
{
	int a[5]={13,45,26,78,65};
	int num;

	printf("enter the number:");
	scanf("%d",&num);
	
	int found = 0;
	for(int i=0; i<5;i++){
			//condition check for number search
			if  (a[i]==num){
			 printf("this number in the array");
			 found = 1;
			 break;	
			}
		}
			if(!found){
				printf("this number is not in the array");
			}
	return 0;
}