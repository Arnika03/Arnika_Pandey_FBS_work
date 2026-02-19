#include<stdio.h>

// fun decl
int triangletypes();
int main()
{
    int result;

    // fun call
    result = triangletypes();

    if(result == 1)
        printf("Triangle is Equilateral\n");
    else if(result == 2)
        printf("Triangle is Isosceles\n");
    else if(result == 3)
        printf("Triangle is Scalene\n");
    else
        printf("There is no triangle\n");

    return 0;
}

// fun def
int triangletypes()
{
    int a, b, c;

    printf("Side1 a: ");
    scanf("%d", &a);

    printf("Side2 b: ");
    scanf("%d", &b);

    printf("Side3 c: ");
    scanf("%d", &c);

    if(a+b>c && a+c>b && b+c>a)
    {
        if(a==b && b==c)
            return 1;   // Equilateral

        else if(a==b || a==c || b==c)
            return 2;   // Isosceles

        else
            return 3;   // Scalene
    }
    else
    {
        return 0;   // Not a triangle
    }
}
