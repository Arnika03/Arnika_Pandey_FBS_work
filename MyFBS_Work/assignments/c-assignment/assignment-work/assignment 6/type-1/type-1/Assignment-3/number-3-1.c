#include<stdio.h>
//fun decl
void numberC();
void main(){
	numberC();//fun call
}
//fun def
void numberC()
{

	for(int i = 1; i<=10; i++){
		printf("%d \n",i);
	}

}