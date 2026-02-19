#include<stdio.h>
// fun decl
int prime();
int main()
{
    int result;
	// fun call
    result = prime();   

    if(result == 1)
        printf("Number is Prime\n");
    else
        printf("Number is Not Prime\n");

    return 0;
}//main ends here

// fun def
int prime()
{
    int no = 7;
    int flag = 0;

    for(int i = 2; i <= no/2; i++)
    {
        if(no % i == 0)
        {
            flag = 1;
            break;
        }
    }

    if(flag == 0)
        return 1;   // Prime
    else
        return 0;   // Not Prime
        
}//prime ends here
