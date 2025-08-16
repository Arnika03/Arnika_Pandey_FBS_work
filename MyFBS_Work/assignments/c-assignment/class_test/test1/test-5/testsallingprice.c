#include<stdio.h>
int bookprice(int,int,int);
int main(){
	int cp,di,sp;
	printf("enter the number");
	scanf("%d",&cp);
	printf("enter parcentage");
	scanf("%d",&di);
	
	int dp=cp*di/100;
	sp=cp-dp;
	bookprice(cp,di,sp);
	return 0;
}
int bookprice(int cp,int di,int sellingprice)
{

	if(di<=20){
		printf("salling price will be discount 20%");	
	}
	else if(di<=30){
			
		printf("salling price will be discount 30%");
	}
	else if(di<=50){
		printf("salling price will be discount 50%");
	}

	printf("salling price%d",sellingprice);
	
	}
