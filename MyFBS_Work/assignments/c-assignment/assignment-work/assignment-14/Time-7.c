struct Time 
{
	int hour;
	int min;
	int sec;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct Time  t1,t2;
	
	t1.hour = 02;
	t1.min = 23;
	t1.sec = 46;
	
	printf("Enter Time Details:");
	scanf("%d",&t2.hour);
	scanf("%d",&t2.min);
	scanf("%d",&t2.sec);
	
	printf("\nTime Details:\n");
	printf("\nTime = %02d:%02d:%02d",t1.hour,t1.min,t1.sec);
	
	printf("\nTime = %02d:%02d:%02d",t2.hour,t2.min,t2.sec);
	
	return 0;
}