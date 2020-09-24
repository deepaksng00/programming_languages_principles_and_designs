class Alphabet {
	private:
		char alphabet[];

		void generateAlphabet() {
			for(int i = 0; i < 26; i++) {
				alphabet[i] = (char)('a'+i);
			}
		}
	public:
		Alphabet() {
			generateAlphabet();
		}

		string getAlphabet() {
			return alphabet;
		}

};