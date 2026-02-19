#include<stdio.h>

// fun decl
int result();
int main()
{
    int res;
    // fun call
    res = result();   

    if(res == 1)
        printf("Distinction\n");
    else if(res == 2)
        printf("First Class\n");
    else if(res == 3)
        printf("Second Class\n");
    else if(res == 4)
        printf("Pass Class\n");
    else
        printf("Fail\n");

    return 0;
}

// fun def
int result()
{
    int marks;

    printf("Marks: ");
    scanf("%d", &marks);

    if(marks > 75)
        return 1;   // Distinction

    else if(marks > 65)
        return 2;   // First Class

    else if(marks > 55)
        return 3;   // Second Class

    else if(marks >= 40)
        return 4;   // Pass

    else
        return 0;   // Fail
}
