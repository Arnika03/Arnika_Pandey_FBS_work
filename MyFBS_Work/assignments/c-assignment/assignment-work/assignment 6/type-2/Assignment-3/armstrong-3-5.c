#include<stdio.h>
// fun decl
int armstrong();
int main()
{
    int result;
	// fun call
    result = armstrong();   

    if(result == 1)
        printf("Number is Armstrong\n");
    else
        printf("Number is Not Armstrong\n");

    return 0;
}

// fun def
int armstrong()
{
    int num = 153;
    int temp, rem, sum = 0;

    temp = num;

    while(temp != 0)
    {
        rem = temp % 10;
        sum = sum + rem * rem * rem;
        temp = temp / 10;
    }

    if(sum == num)
        return 1;   // Armstrong
    else
        return 0;   // Not Armstrong
}
