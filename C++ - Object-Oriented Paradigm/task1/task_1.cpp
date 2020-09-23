#include <iostream>
#include "Calculate.cpp"
#include "FizzBuzz.cpp"

int main() {
	Calculate * fizz = new Calculate(3);
	Calculate * buzz = new Calculate(5);
	Calculate * fizzbuzz = new Calculate(15);

	FizzBuzz * fizzbuzz_session = new FizzBuzz(fizz, buzz, fizzbuzz);

	fizzbuzz_session->calculateFizzBuzz();
}