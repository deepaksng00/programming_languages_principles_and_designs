#include <iostream>
#include <new>
#include <cstring>
#include "Letters.cpp"

using namespace std;

int main() {
	alphabet * alphabetgenerator = new Alphabet();
	string s = "helloworld";

	string alphabet = alphabetgenerator->getAlphabet();
	
	for(int i = 0; i < 26; i++) {
		for(int x = 0; x < strlen(s); x++) {
			if(alphabet[i] == s[x])
		}
	}
}