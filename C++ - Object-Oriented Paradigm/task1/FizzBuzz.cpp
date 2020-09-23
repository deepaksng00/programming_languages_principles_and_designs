#include <iostream>

class FizzBuzz {
	private:
		Calculate * fizzDivisor;
		Calculate * buzzDivisor;
		Calculate * fizzbuzzDivisor;

	public:
		FizzBuzz(Calculate * divisorFizz, Calculate * divisorBuzz, Calculate * divisorFizzBuzz) {
			fizzDivisor = divisorFizz;
			buzzDivisor = divisorBuzz;
			fizzbuzzDivisor = divisorFizzBuzz;
		}

		void calculateFizzBuzz() {
		for(int i = 0; i <= 100; i++) {
			if(i % fizzbuzzDivisor->getDivisor() == 0) {
				std::cout << "FizzBuzz" << std::endl;
			} else if (i % fizzDivisor->getDivisor() == 0) {
				std::cout << "Fizz" << std::endl;
			} else if (i % buzzDivisor->getDivisor() == 0) {
				std::cout << "Buzz" << std::endl;
			} else {
				std::cout << i << std::endl;
			}
		}
	}
};