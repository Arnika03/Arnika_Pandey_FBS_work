#include<stdio.h>

// fun decl
int agecheck();
int main()
{
    int result;
	// fun call
    result = agecheck();   

    if(result == 1)
        printf("Child\n");
    else if(result == 2)
        printf("Teenager\n");
    else if(result == 3)
        printf("Adult\n");
    else if(result == 4)
        printf("Senior\n");

    return 0;
}

// fun def
int agecheck()
{
    int age;

    printf("Enter the age: ");
    scanf("%d", &age);

    if(age <= 12)
        return 1;   // Child

    else if(age <= 19)
        return 2;   // Teenager

    else if(age <= 59)
        return 3;   // Adult

    else
        return 4;   // Senior
}
