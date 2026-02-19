#include<stdio.h>
//fun decl
void triangletypes();
void main(){
	
	//fun call
	triangletypes();
}

//fun def
void triangletypes()
{
	int a,b,c;
		
	printf("side1 a:");
	scanf(" %d",&a);
	
	printf("side2 b:");
	scanf(" %d",&b);
	
	printf("side3 c:");
	scanf(" %d",&c);
	
	if(a+b>c && a+c>b && b+c>a){
	
	if(a==b && b==c){
		printf("triangle is equilateral \n:",a,b,c);
	}
	else if(a==b || a==c || b==c){
		
		printf("triangle is isoscele: \n",a,b,c);
	}
	else if(a!=b && a!=c && b!=c){
		printf("triangle is scalene: \n",a,b,c);
	}
}
	else{
		printf("there is no triangle");
	}
	
}