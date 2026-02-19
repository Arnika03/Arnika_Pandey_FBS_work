#include<stdio.h>
//fun decl
void sum();
void main(){
	
	//fun call
	sum();
}
	//fun def
	void sum()
{
	int no = 1,
	sum = 0, ts;
	while(no<=5){
		sum=sum+no;
		no++;	
	}
	printf("sum=%d ",sum);
}
		
	
