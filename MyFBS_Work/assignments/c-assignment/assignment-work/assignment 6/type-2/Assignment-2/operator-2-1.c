#include<stdio.h>

// fun decl
int operatoruse();   // return type int
int main()
{
    int result;

    // fun call
    result = operatoruse();

    printf("Result = %d\n", result);

    return 0;
}

// fun def
int operatoruse()
{
    int num1, num2;
    char oper;

    printf("First number: ");
    scanf("%d", &num1);

    printf("Second number: ");
    scanf("%d", &num2);

    printf("Operator (+, -, /, *, %%): ");
    scanf(" %c", &oper);

    if (oper == '+')
        return num1 + num2;

    else if (oper == '-')
        return num1 - num2;

    else if (oper == '/')
        return num1 / num2;

    else if (oper == '*')
        return num1 * num2;

    else if (oper == '%')
        return num1 % num2;

    else
    {
        printf("Operator not available\n");
        return 0;   // default return
    }
}
