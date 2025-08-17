#include<stdio.h>
//fun decl
void result();
void main(){
	
	//fun call
	result();
}

//fun def
void result()
{
	int marks;
	
	printf("marks :");
	scanf(" %d",&marks);
	
	
	if(marks>75){
		printf("Distinction");
	}
	else{
		if(marks>65){
		printf("First Class");	
		}
		else{
			if(marks>55){
				printf("Second Class");
			}
			else{
				if(marks>=40){
					printf("pass Class");
				}
				else{
					printf("Fail");
				}
			}
		}
	}
}