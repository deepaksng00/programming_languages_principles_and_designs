class Letter {
	private:
		char letter; 
		int occurrences;
		int * occurrencesPtr = &occurrences;
		char * letterPtr = &letter;

		void incrementOccurrencesPrivate() {
			*occurrencesPtr = *occurrencesPtr + 1;
		}
	public:
		Letter(char userLetter, int userOccurrences) {
			*letterPtr = userLetter;
			*occurrencesPtr = userOccurrences;
		}

		char getLetter() {
			return *letterPtr;
		}

		int getOccurrences() {
			return *occurrencesPtr;
		}

		void incrementOccurrences() {
			incrementOccurrencesPrivate();
		}
};