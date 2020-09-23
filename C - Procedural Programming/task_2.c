#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int number = 5;
  int factorial = number;

  for(int i = number-1; i != 0; i--) {
    factorial = factorial * i;
  }

  printf("%i \n", factorial);
  return 0;
}
