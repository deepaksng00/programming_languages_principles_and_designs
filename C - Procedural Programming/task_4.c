#include <stdio.h>
#include <stdbool.h>

void swap(bool * ptr1, bool * ptr2) {
	int ptr1_bak = *ptr1; // backup the value currently stored in memory location ptr1
	*ptr1 = *ptr2;
	*ptr2 = ptr1_bak;
}

void swapThree(bool * ptr1, bool * ptr2, bool * ptr3) {
	swap(ptr1, ptr2);
	swap(ptr2, ptr3);
}

int main(void) {
	printf("Welcome to the 'find the ball' game! \n");
	printf("Shuffling cups.... \n");

	/* ---- Values for each slot ---- */
	bool b1 = true;
	bool b2 = false;
	bool b3 = false;

	/* ---- Pointers to addresses of slots ---- */
	bool * b1_ptr = &b1;
	bool * b2_ptr = &b2;
	bool * b3_ptr = &b3;

	// shuffle cups
	swapThree(b1_ptr, b2_ptr, b3_ptr);

	printf("========= ========= =========\n");
	printf("= CUP 1 = = CUP 2 = = CUP 3 =\n");
	printf("========= ========= =========\n");

	// user guess
	int guess;

	printf("Please enter the slot you believe the ball is in (enter 1, 2 or 3): ");
	scanf("%i", &guess);

	/* ---- Conditional statements to verify user guess ---- */
	if(guess == 1) {
		if(b1) {
			printf("\nCongratulations! You Won!");
		} else {
			printf("\nYou've lost.");
		}
	} else if (guess == 2) {
		if(b2) {
			printf("\nCongratulations! You Won!");
		} else {
			printf("\nYou've lost.");
		}
	} else if (guess == 3) {
		if(b3) {
			printf("\nCongratulations! You Won!");
		} else {
			printf("\nYou've lost.");
		}
	}

	return 0;
}