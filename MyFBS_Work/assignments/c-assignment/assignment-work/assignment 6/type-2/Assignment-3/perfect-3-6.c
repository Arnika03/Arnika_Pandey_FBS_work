#include<stdio.h>
// function declaration
int perfect();
int main()
{
    int result;
	// fun call
    result = perfect();   

    if(result == 1)
        printf("Number is Perfect\n");
    else
        printf("Number is Not Perfect\n");

    return 0;
}//main ends here

// fun def
int perfect()
{
    int num = 15;
    int sum = 0;

    for(int i = 1; i < num; i++)
    {
        if(num % i == 0)
        {
            sum += i;
        }
    }

    if(sum == num)
        return 1;   // Perfect
    else
        return 0;   // Not Perfect
}
