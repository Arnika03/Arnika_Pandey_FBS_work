//odd and even among the numbers
#include<stdio.h>
int main(){
	int arr[10];
	
	
	for(int i=0; i<10;i++){
		printf("element in array: ");
		scanf("%d",&arr[i]);{
		
		if(i%2==0){
			printf("given numbers are even \n");
		}
		else{
			printf("given numbers are odd \n");
		}
	}
	}
	
	return 0;
}