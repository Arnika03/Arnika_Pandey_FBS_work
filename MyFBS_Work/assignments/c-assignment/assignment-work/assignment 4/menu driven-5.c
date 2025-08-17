//a menu driven program to take a number for user and perform operations
#include<stdio.h>
void main()
{
	int num;
	int sum=0;
	printf("enter the number:");
	scanf("%d",&num);
	
	printf("enter 1------>EvenOdd\n");
	printf("enter 2------>prime\n");
	printf("enter 3------>pallindrome\n");
	printf("enter 4------>positive, negative or zero\n");
	printf("enter 5------>reverse a number.\n");
	printf("enter 6------>sum of digits.\n");
	
	int choice;
	scanf("%d",&num);
	
	if(choice==1){
		if(num%2 == 0)
		{
		printf("%d is even",num);
		}
		else{
		printf("%d is odd",num);
		}
	}
	else if(choice==2){
		int flag = 1;
		for(int i =2; i<= num/2 ;i++){
		if(num%i==0){
			flag=1;
			break;
		}
	}
		if(flag==0){
			printf("no is  prime  \n");
		}
		else{
			printf("no is not prime \n");
		}	
	}
	else if(choice==3){
		
		int num = 121 ;
	int temp,r,rev = 0;
	temp = num;
	
	while(temp != 0){
		r = temp % 10;
		rev = rev * 10 + r;
		temp = temp / 10;
		
	}
	if(rev == num){
		printf("%d is Palindrome number\n",num);
	}
	else{
		printf("%d is not Palindrome number\n",num);
	 
	}
	
	}
	else if(choice==4){
		if(num>0){
		printf("number is positive");
	}
	else if(num<0){
		printf("number is negative");
	}
	else if(num==0){
		printf("number is neutral");
	}
	
	}
	
//	else if(choice==5){
//		
//	}
	
	else if(choice==6){
		while(num<=5){
		sum=sum+num;
		num++;	
	}
	printf("sum=%d ",sum);
	}
	
}