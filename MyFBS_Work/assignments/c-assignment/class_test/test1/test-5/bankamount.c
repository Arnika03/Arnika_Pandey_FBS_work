#include<stdio.h>
void letestamount(int,int,int,int);
void main(){
	 int amou = 15000;
	 int deposit;
	 int withdraw;
	 int choice;
	 
	 printf(" deposit amount :");
	 scanf("%d",&deposit);
	 
	 printf("withdraw amount :");
	 scanf("%d",&withdraw);
	 
	 printf("enter 1---->deposit\n");
	 printf("enter 2---->withdraw\n");
	 
	 scanf("%d",&choice);
 
	 letestamount(amou,deposit,withdraw,choice);
}
	void letestamount(int amou,int deposit,int withdraw,int choice)
{
//	while()
int total_amount;
	if(choice==1){
		total_amount = amou + deposit;
		printf("%d",total_amount);
	}
	else{
		if(choice==2 && amou>3000){
			total_amount = amou - withdraw; 
			printf("%d",total_amount);
		}
		else{
			printf("can't withdraw the amount balance is not sufficient");
		}	
	}
}