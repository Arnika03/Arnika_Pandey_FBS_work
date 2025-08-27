struct Distance
{
	int feet;
	int inch;
	
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct Distance d1,d2;
	
	d1.feet = 02;
	d1.inch = 23;
	
	printf("Enter Distance Details:");
	scanf("%d",&d2.feet);
	scanf("%d",&d2.inch);
	
	if(d1.inch >= 12)
		{
        d1.feet += d1.inch / 12;  
        d1.inch = d1.inch % 12;   
    }
	if(d2.inch >= 12)
		{
        d2.feet += d2.inch / 12;  
        d2.inch = d2.inch % 12;   
    }
	printf("\nDistance Details:\n");
	printf("\nDistance =  %d feet:%d inch",d1.feet,d1.inch);
	
	printf("\nDistance = %d feet:%d inch",d2.feet,d2.inch);
	
	return 0;
}