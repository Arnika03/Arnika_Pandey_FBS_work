struct Complex
{
	int real;
	int imaginary;
	Complex (real, imaginary)
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct Complex c1,c2;
	
	c1.real = 02;
	c1.imaginary = 23;
	
	printf("Enter Distance Details:");
	scanf("%d",&c2.real);
	scanf("%d",&c2.imaginary);
	
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