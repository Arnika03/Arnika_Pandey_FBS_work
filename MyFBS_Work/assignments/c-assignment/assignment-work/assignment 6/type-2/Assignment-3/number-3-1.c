#include<stdio.h>

// fun decl
int numberC();
int main()
{
    int last;
    // fun call
    last = numberC();   
    printf("Last number printed: %d\n", last);

    return 0;
}

// fun def
int numberC()
{
    int i;
    for(i = 1; i <= 10; i++)
    {
        printf("%d\n", i);
    }
    
    return i - 1;   // return last number (10)
}
