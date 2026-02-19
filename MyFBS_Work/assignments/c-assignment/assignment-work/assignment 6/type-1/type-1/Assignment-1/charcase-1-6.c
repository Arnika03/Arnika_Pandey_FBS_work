#include<stdio.h>
//function decl
void charcase();
void main(){
	//function call
	charcase();
}

//function def
void charcase()
{
	
	char ch = 'e';
	
	
	if(ch>='A'&& ch<='Z'){
	printf("%c = is uppercase character",ch);
	}
	
	else{
		printf("%c = is lowerrcase character",ch);
	}
}