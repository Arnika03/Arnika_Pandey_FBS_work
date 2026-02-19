#include<stdio.h>
//function declration
void leapyear();
void main(){
	
	//function call
	leapyear();
}
	//function definition
 	void leapyear()
{
	int year = 1992;
	
	if(year%4 == 0){
		printf("%d = this year is leap year",year);
	}
	else{
		printf("%d = this is not a leap year",year);
	}
}