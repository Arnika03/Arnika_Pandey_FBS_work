#include<stdio.h>

// func decl
int sum();
int main()
{
    int result;
    // fun call
    result = sum();   
    printf("Sum = %d\n", result);

    return 0;
}//main ends here

// function definition
int sum()
{
    int no = 1;
    int total = 0;

    while(no <= 5)
    {
        total = total + no;
        no++;
    }

    return total;   // return calculated sum
}
