#include<stdio.h>
// fun decl
int fldigitsum();
int main()
{
    int result;
	// fun call
    result = fldigitsum();   

    printf("Sum of first and last digit is: %d\n", result);

    return 0;
}

// fun def
int fldigitsum()
{
    int num = 62345;
    int temp = num;
    int firstDigit, lastDigit,sum=0;

    // last digit
    lastDigit = num % 10;

    // find first digit
    while(temp >= 10)
    {
        temp = temp / 10;
    }

    firstDigit = temp;
    sum= firstDigit + lastDigit;

    return sum;   // return sum
}
