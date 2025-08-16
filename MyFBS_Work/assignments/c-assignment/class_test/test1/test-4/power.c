#include<stdio.h>
void main()
{
	int num =3,power=4;
	int res=1,temp=1;
	
	for(int i=1;i<=power;i++){
		res=num*res;		
	}
	printf("%d",res);
}