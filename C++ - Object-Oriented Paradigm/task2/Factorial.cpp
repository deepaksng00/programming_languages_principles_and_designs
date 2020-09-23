#include <iostream>

class Factorial {
	private:
		int value;

		void calculateFactorial(int * total, int multiplier) {
			if(multiplier != 0) {
				*total = *total * multiplier;
				calculateFactorial(total, multiplier -1);
			}
		}
	public:
		Factorial(int userValue) {
			value = userValue;
			calculateFactorial(&value, value-1);
		}

		int getValue() {
			return value;
		}
};