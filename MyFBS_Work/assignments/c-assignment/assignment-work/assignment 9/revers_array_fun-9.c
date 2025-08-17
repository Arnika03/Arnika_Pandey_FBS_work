#include <stdio.h>

// Function to reverse and print array
void reverseArray(int arr[], int n) {
    printf("\nReversed Array:\n");
    for (int i = n - 1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int n, i;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter elements of array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Call the function
    reverseArray(arr, n);

    return 0;
}
