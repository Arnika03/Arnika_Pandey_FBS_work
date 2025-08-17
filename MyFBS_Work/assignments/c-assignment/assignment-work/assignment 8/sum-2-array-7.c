//Take two array and add sum in third array
#include <stdio.h>

int main() {
    int n, i;

    printf("Enter size of arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];
    printf("Enter elements of first array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter elements of second array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    for (i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
    }

    printf("Result Sum Array:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", sum[i]);
    }

    return 0;
}
