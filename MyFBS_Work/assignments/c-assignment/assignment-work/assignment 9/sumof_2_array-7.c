//Take two array and add sum in third array
#include <stdio.h>
void sumofarray(int,int[],int[],int[]);
int main() {
    int n;

    printf("Enter size of arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];
    printf("Enter elements of first array:\n");
    
    sumofarray(n,arr1,arr2,sum);
     return 0;
}
 void sumofarray(int n,int arr1[],int arr2[],int sum[])   
{
	
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }
    printf("Enter elements of second array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
    }

    printf("Result Sum Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", sum[i]);
    }  
}
