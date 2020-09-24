#include <iostream>
#include <vector>

using namespace std;

#include "Alphabet.cpp"
#include "Letter.cpp"
#include "Frequency.cpp"

int main() {
	Frequency * f = new Frequency("helloworld");
	vector<Letter*> v = f->getArray();

	cout << "Size of vector: " << v.size() << endl;

	for(auto vi : v) {
		cout << vi->getLetter() << ":" << vi->getOccurrences() << endl;
	}
}