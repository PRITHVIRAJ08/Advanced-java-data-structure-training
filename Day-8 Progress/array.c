#include <stdio.h>

int main() {
    int array[5];
    int size = 0;

    printf("Enter the number of elements to insert (up to 5): ");
    scanf("%d", &size);

    if (size > 5) {
        printf("Array size exceeded! Maximum size is 5.\n");
        return 1;
    }

    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    // Print the array
    printf("Array elements: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    return 0;
}
