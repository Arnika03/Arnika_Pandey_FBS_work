#include<stdio.h>
// fun decl
int palindrome();
int main()
{
    int count;
	// fun call
    count = palindrome();   
    printf("Total Palindrome numbers between 1 to 10000: %d\n", count);

    return 0;
}

// fun def
int palindrome()
{
    int total = 0;
    
    for(int i = 1; i <= 10000; i++)
    {
        int num = i;
        int temp = num;
        int r, rev = 0;

        while(temp != 0)
        {
            r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if(rev == num)
        {
            printf("%d is Palindrome number\n", num);
            total++;   // count increase
        }
    }
    return total;   // return total palindrome count
}
