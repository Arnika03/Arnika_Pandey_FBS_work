#include<stdio.h>

// fun decl
int greatest();
int main()
{
    int result;

    result = greatest();   // fun call

    printf("Greatest number is %d\n", result);

    return 0;
}

// fun def
int greatest()
{
    int a, b, c;

    printf("Enter 3 numbers: ");
    scanf("%d%d%d", &a, &b, &c);

    if(a > b)
    {
        if(a > c)
            return a;
        else
            return c;
    }
    else
    {
        if(b > c)
            return b;
        else
            return c;
    }
}
