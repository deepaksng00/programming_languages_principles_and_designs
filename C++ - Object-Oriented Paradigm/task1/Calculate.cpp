#include <iostream>

class Calculate {
	private:
		int divisor;

	public:
		Calculate(int userDivisor) {
			divisor = userDivisor;
		}

		Calculate() {
			
		}

		int getDivisor() {
			return divisor;
		}
};