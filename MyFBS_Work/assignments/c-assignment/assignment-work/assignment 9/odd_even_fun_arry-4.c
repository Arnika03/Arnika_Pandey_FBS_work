#include <stdio.h>

// Function to check and print odd/even
void checkOddEven(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d is Even\n", arr[i]);
        } else {
            printf("%d is Odd\n", arr[i]);
        }
    }
}

int main() {
    
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Call function to check odd/even
    checkOddEven(arr, n);

    return 0;
}
