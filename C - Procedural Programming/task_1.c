#include <stdio.h>

int main(int argc, char const *argv[]) {
  for(int i = 1; i < 100; i++) {
    if(i % 5 == 0 && i % 3 == 0) {
      printf("%s\n", "FizzBuzz");
    } else if (i % 5 == 0) {
      printf("%s\n", "Buzz");
    } else if (i % 3 == 0) {
      printf("%s\n", "Fizz");
    } else {
      printf("%i\n", i);
    }
  }
  return 0;
}
