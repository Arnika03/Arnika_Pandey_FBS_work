//strstr user define function
#include <stdio.h>


int main() {
    char str[] = "Hello,my name is arnika pandey";
    char sub[] = "arnika";

    char *result = myStrStr(str, sub);

    if (result != '\0') {
        printf("Substring found %ld\n", result - str);
       
    } else {
        printf("Substring not found\n");
    }

    return 0;
}
char* myStrStr(const char* haystack, const char* needle)
 {
   
    return \0; 
}
