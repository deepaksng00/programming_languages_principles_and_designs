#include <iostream>

class FizzBuzz {
	private:
		Calculate * type1Divisor;
		Calculate * type2Divisor;
		Calculate * type12Divisor;

	public:
		FizzBuzz(Calculate * divisorType1, Calculate * divisorType2, Calculate * divisorType12) {
			type1Divisor = divisorType1;
			type2Divisor = divisorType2;
			type12Divisor = divisorType12;
		}

		void calculateFizzBuzz() {
		for(int i = 1; i <= 100; i++) {
			if(i % type12Divisor->getDivisor() == 0) {
				std::cout << type12Divisor->getType() << std::endl;
			} else if (i % type1Divisor->getDivisor() == 0) {
				std::cout << type1Divisor->getType() << std::endl;
			} else if (i % type2Divisor->getDivisor() == 0) {
				std::cout << type2Divisor->getType() << std::endl;
			} else {
				std::cout << i << std::endl;
			}
		}
	}
};