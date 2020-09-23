#include <iostream>
#include "Calculate.cpp"
#include "FizzBuzz.cpp"

int main() {
	Calculate * type1 = new Calculate(3, "Fizz");
	Calculate * type2 = new Calculate(5, "Buzz");
	Calculate * type12 = new Calculate(15, "FizzBuzz");

	FizzBuzz * fizzbuzz_session = new FizzBuzz(type1, type2, type12);

	fizzbuzz_session->calculateFizzBuzz();
}