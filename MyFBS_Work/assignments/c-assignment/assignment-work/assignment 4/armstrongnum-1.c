//armstrong numbers in the given range
#include <stdio.h>
int main() {
	int start,end;
	printf("enter the start number:");
	scanf("%d",&start);
	printf("enter the end number:");
	scanf("%d",&end);
	
	for (int i=start; i<=end; i++){

		int no=i;
		int r,sum=0;
		int temp=no;

		while (temp!=0) {
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if (no==sum) {
			printf("%d is armstrong\n",no);
		}
	}
	return 0;
}