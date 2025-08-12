#include<stdio.h>
void main(){
	int unit=155,bill=0;
//	printf("enter the unit");
//	scanf("%d",&unit);
	
	if(unit>1 && unit<50){
		bill = unit*30;
		
	}
	else if (unit>51 && unit<150){
		bill = unit*40;
		
}
	else if (unit>151){
		bill = unit*50;
		
	}
	printf("%d",bill);
}