#include<stdio.h>
//fun decl
void palindrome();
void main(){
	
	//fun call
	palindrome();
}

//fun def
void palindrome()
{
	
	for(int i=1;i<=10000;i++)
	{
	
	int num = i;
	int temp,r1,r,rev = 0;
	temp = num;
	
	while(temp != 0){
		r = temp % 10;
		rev = rev * 10 + r;
		temp = temp / 10;
		
	}
	if(rev == num){
		printf("%d is Palindrome number\n",num);
	}

	 
	}
} 