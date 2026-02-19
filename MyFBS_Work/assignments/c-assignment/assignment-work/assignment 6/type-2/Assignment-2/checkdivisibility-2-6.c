#include<stdio.h>

// fun decl
int CheckDivisibility();

int main()
{
    int result;
	// fun call
    result = CheckDivisibility();   

    if(result == 1)
        printf("Divisible by 3 but not by 5\n");
    else if(result == 2)
        printf("Divisible by 5 but not by 3\n");
    else if(result == 3)
        printf("Divisible by both\n");
    else
        printf("Divisible by None\n");

    return 0;
}

// function definition
int CheckDivisibility()
{
    int num;

    printf("Enter the number: ");
    scanf("%d", &num);

    if(num%3==0 && num%5!=0)
        return 1;

    else if(num%3!=0 && num%5==0)
        return 2;

    else if(num%3==0 && num%5==0)
        return 3;

    else
        return 0;
}
