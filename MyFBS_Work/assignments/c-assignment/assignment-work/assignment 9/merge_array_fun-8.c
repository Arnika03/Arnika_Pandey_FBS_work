#include <stdio.h>

// Function to merge two arrays
void mergeArrays(int arr1[], int n1, int arr2[], int n2, int merged[]) {
    int i, j;

    // Copy elements of first array
    for (i = 0; i < n1; i++) {
        merged[i] = arr1[i];
    }

    // Copy elements of second array
    for (j = 0; j < n2; j++) {
        merged[n1 + j] = arr2[j];
    }
}

// Function to print array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int n1, n2, i;

    // Input size of first array
    printf("Enter size of first array: ");
    scanf("%d", &n1);
    int arr1[n1];
    printf("Enter elements of first array:\n");
    for (i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    // Input size of second array
    printf("Enter size of second array: ");
    scanf("%d", &n2);
    int arr2[n2];
    printf("Enter elements of second array:\n");
    for (i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    // Declare merged array
    int merged[n1 + n2];

    // Call merge function
    mergeArrays(arr1, n1, arr2, n2, merged);

    // Print merged array
    printf("Merged Array:\n");
    printArray(merged, n1 + n2);

    return 0;
}
