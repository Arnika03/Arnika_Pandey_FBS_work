#include <stdio.h>

int main()
{
    char str[100];
    char ch, spechar;
    int i;

    printf("Enter the string: ");
    scanf("%s", str);

    printf("Enter the character you want to replace: ");
    scanf(" %c", &ch); 

    printf("Enter the special character to replace with: ");
    scanf(" %c", &spechar);
     printf("before swaping string is: %s \n", str);

    for(i = 0; str[i] != '\0'; i++)
    {
    
        if(str[i] == ch)
        {
            str[i] = spechar;
        }
    }

    printf("after swaping string is: %s", str);

    return 0;
}
