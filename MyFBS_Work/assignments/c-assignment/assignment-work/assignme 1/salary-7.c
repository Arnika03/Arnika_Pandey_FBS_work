#include<stdio.h>
void main(){
	double basics = 4000;
	double da,ta,hra,ts;
	
	if(basics<=5000){
		da = basics*0.10;
		ta = basics*0.20;
		hra = basics*0.25;
		
		printf("da= %lf ta= %lf hra= %lf",da,ta,hra);
	}
	else{
		da = basics*0.15;
		ta = basics*0.25;
		hra = basics*0.30;
		
		printf("da= %lf ta= %lf hra= %lf   ",da,ta,hra);
		
		
	}
	ts = basics+da+ta+hra;
	printf(" ts= %lf",ts);
	
}