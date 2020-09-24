class Soup : public Food, public Drink {
	private:
		string flavour;
	public:
		/* --- Constructor --- */
		Soup(string inputName, double inputPrice, int inputCalories, int inputVolume, string inputFlavour):Food(inputName, inputPrice, inputCalories), Drink(inputName, inputPrice, inputVolume) {
			flavour = inputFlavour;
		}

		/* --- Getters --- */
		string getFlavour() {
			return flavour;
		}
};