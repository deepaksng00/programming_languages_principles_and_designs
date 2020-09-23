#include <iostream>

using namespace std;

class Letter {
	private:
		char letter; 
		int occurrences;
	public:
		Letter(char userLetter, int userOccurrences) {
			letter = userLetter;
			occurrences = userOccurrences;
		}

		char getLetter() {
			return letter;
		}

		int getOccurrences() {
			return occurrences;
		}
}