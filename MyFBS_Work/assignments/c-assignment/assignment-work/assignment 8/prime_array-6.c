//print only prime numbers of array
#include<stdio.h>
int main()
{
	int n,flag=1;
	
	printf("enter the array of size:");
	scanf("%d",&n);
	int arr[n];
	for (int i=1; i<n; i++)
	{
	scanf("%d", &arr[i]);
		// num is prime
		 int num = arr[i];
		flag = 1;
		
		if(num<2){
			//num is not prime
			flag = 0;
		}
	
		for (int j=2; j<=num/2; j++)
	{
		if(num%j==0){
			flag=0;
			break;
		}
					
	}
	if(flag==1){
			printf("%d is prime \n",num);
		}
	}
	return 0;
}
 