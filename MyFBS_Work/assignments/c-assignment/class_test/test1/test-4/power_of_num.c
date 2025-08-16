#include<stdio.h>
int main()
{
	int num,power,res=1;
	
	printf("enter the number:");
	scanf("%d",&num);
	printf("enter power:");
	scanf("%d",&power);
	
	for(int i=1;i<=power;i++){
		res = num*res;
		}
	printf("%d",res);
	return 0;
}