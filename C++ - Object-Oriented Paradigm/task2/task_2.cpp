#include <iostream>
#include "Factorial.cpp"

int main() {
	Factorial * factorialCalculation = new Factorial(5);
	std::cout << factorialCalculation->getValue() << std::endl;
}