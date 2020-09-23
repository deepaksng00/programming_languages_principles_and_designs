#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>
#include <stdlib.h>

int main(void) {
  char * unformattedString = "hello world";
  char * formattedString = malloc(sizeof(strlen(unformattedString)));

  for(int i = 0; i < strlen(unformattedString); i++) {
    if(!isspace(unformattedString[i])) {
      char ch = unformattedString[i];
      strncat(formattedString, &ch, 1);
    }
  }

  struct Letter {
    char letter;
    int occurrences;
  };

  struct Letter * letters = malloc(sizeof(struct Letter) * 10);

  bool recorded = false;
  int pointer = 0;

  for(int i = 0; i < strlen(formattedString); i++) {
    for(int x = 0; x < strlen(formattedString); x++) {
      if(formattedString[i] == formattedString[x]) {
        // loop through struct list to see if already present
        for(int z = 0; z < sizeof(*letters); z++) {
          if(formattedString[i] == letters[z].letter) {
            // if found in list of structs then don't add to struct
            recorded = true;
          }
        }
        if(recorded != true) {
          struct Letter l = { 
            .letter = formattedString[i],
            .occurrences = 0
          };

          letters[pointer] = l;
          pointer++;
        }
      }
    }
    recorded = false;
  }

  for(int z = 0; z < (sizeof(*letters)); z++) {
    for(int i = 0; i < strlen(formattedString); i++) {
      if(letters[z].letter == formattedString[i]) {

        letters[z].occurrences++;
      }
    }
  }


  for(int z = 0; z < (sizeof(*letters)); z++) {
    printf("%c : %i\n", letters[z].letter, letters[z].occurrences);
  }

  free(letters);
  free(formattedString);

  return 0;
}