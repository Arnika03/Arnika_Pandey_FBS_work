//sum of all numbers.
#include<stdio.h>
void sumofarray(int[],int);
int main()
{
	int arr[5];
	int sum=0;
	
	sumofarray(arr,sum);
	return 0;
}
void sumofarray(int arr[],int sum)	
{

	for(int i=0; i<5;i++){
		printf("element in array: ");
		scanf("%d,",&arr[i]);
		sum = sum+arr[i];
	}
	printf("sum of all numbers = %d",sum);

}