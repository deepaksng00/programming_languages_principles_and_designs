class Frequency {
	private:
		vector<Letter *> frequencyArray;
		string inputString;

		void insertFrequency(Letter * userLetter) {
			frequencyArray.push_back(userLetter);
		}

		void findOccurrences() {
			Alphabet * alphabet = new Alphabet();
			string alphabetString = alphabet->getAlphabet();
			bool foundInVector = false;

			for(int i = 0; i < alphabetString.length(); i++) {
				for(int x = 0; x < inputString.size(); x++) {
					if(alphabetString[i] == inputString[x]) {
						for(int z = 0; z < frequencyArray.size(); z++) {
							if(frequencyArray[z]->getLetter() == inputString[x]) {
								frequencyArray[z]->incrementOccurrences();
								foundInVector = true;
							}
						}
						if(!foundInVector) {
							Letter * l = new Letter(alphabetString[i], 1);
							insertFrequency(l);
						}
						foundInVector = false;
					}
				}
			}
		}
	public:
		Frequency(string userString) {
			inputString = userString;
			findOccurrences();
		}

		vector<Letter*> getArray() {
			return frequencyArray;
		}
};