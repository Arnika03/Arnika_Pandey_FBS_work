#include<stdio.h>

// fun decl
int table5();
int main()
{
    int last;
	// fun call
    last = table5();   
    printf("\nLast value of table: %d\n", last);

    return 0;
}

// fun def
int table5()
{
    int no = 1;
    int value = 0;

    while(no <= 10)
    {
        value = no * 5;
        printf("%d ", value);
        no++;
    }

    return value;   // return last value (50)
}
