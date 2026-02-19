#include<stdio.h>
// fun decl
int factorial();
int main()
{
    int result;
	// fun call
    result = factorial();   
    printf("Factorial is %d\n", result);

    return 0;
}

// fun def
int factorial()
{
    int num = 5;
    int fact = 1;

    for(int i = 1; i <= num; i++)
    {
        fact = fact * i;
    }

    return fact;   // return calculated factorial
}
