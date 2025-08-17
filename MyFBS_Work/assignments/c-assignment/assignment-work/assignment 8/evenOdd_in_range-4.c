//odd and even among the numbers
#include<stdio.h>
int main(){
	int arr[10];
	int start,end;
	
	printf("start element in array: ");
	scanf("%d,",&start);
		
	printf("end element in array: ");
	scanf("%d,",&end);
	
	for(int i=start; i<end;i++){
//		printf("element in array: ");
//		scanf("%d,",&arr[i]);
{
		
		if(i%2==0){
			printf("number is even %d \n",i);
		}
		else{
			printf("numbers are odd %d \n",i);
		}
	}
	}
	
	return 0;
}