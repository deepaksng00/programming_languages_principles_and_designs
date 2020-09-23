#include <iostream>

class Calculate {
	private:
		int divisor;
		std::string type;

	public:
		Calculate(int userDivisor, std::string label) {
			divisor = userDivisor;
			type = label;
		}

		Calculate() {
			
		}

		int getDivisor() {
			return divisor;
		}

		std::string getType() {
			return type;
		}
};