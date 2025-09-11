#include <stdio.h>

int main()
{
    int start, end;
    int sum = 0;
    int flag = 0; 

    printf("Enter the Start number: ");
    scanf("%d", &start);

    printf("Enter the End number: ");
    scanf("%d", &end);

    for (int i = start; i <= end; i++)
    {
        if (i <= 1)
            continue; 

        for (int j = 2; j * j <= i; j++)
        {
            if (i % j == 0)
            {
                flag = 1; 
                break;
            }
        }
        if (flag == 0) 
        {
            sum = sum + i;
        }
    }

    printf("Sum of Prime numbers from %d to %d = %d\n", start, end, sum);

    return 0;
}
