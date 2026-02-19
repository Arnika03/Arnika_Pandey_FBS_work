#include<stdio.h>

// function declaration
double discount();
int main()
{
    double final_price;
    
    // fun call
    final_price = discount();   
    if(final_price > 0)
        printf("Final Price after discount: %.2lf\n", final_price);
    else
        printf("There is no discount\n");

    return 0;
}

// fun def
double discount()
{
    double price, total_price, discount = 0;
    char student;

    printf("Enter purchase price: ");
    scanf("%lf", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);

    if(student == 'y')
    {
        if(price > 500)
            discount = price * 20 / 100;
        else
            discount = price * 10 / 100;

        total_price = price - discount;
        return total_price;
    }
    else if(student == 'n')
    {
        if(price > 600)
        {
            discount = price * 15 / 100;
            total_price = price - discount;
            return total_price;
        }
        else
        {
            return 0;   // no discount
        }
    }

    return 0;  // invalid input case
}
