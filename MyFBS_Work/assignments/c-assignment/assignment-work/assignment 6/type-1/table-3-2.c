#include<stdio.h>
//fun decl
void table5();
void main(){
	//fun call
	table5();	
}
	//fun def
	void table5()
	
{
	int no = 1;
	while(no<=10)
	{
		printf("%d ",no*5);
		no++;
	}
}