#include<stdio.h>
// fun decl
int strongnum();
int main()
{
    int result;
	// fun call
    result = strongnum();   

    if(result == 1)
        printf("Number is Strong number\n");
    else
        printf("Number is Not Strong number\n");

    return 0;
}//main ends here

// fun def
int strongnum()
{
    int num = 145;
    int fact, r, sum = 0;
    int temp = num;

    while(temp != 0)
    {
        fact = 1;
        r = temp % 10;

        for(int i = 1; i <= r; i++)
        {
            fact = fact * i;
        }

        sum = sum + fact;
        temp = temp / 10;
    }

    if(sum == num)
        return 1;   // Strong
    else
        return 0;   // Not Strong
}
