class Soft_Drink : public Drink {
	private:
		bool fizzy;
	public:
		/* --- Constructor --- */
		Soft_Drink(string inputName, double inputPrice, int inputVolume, bool inputFizzy):Drink(inputName, inputPrice, inputVolume) {
			fizzy = inputFizzy;
		}

		/* --- Getters --- */
		bool getFizzy() {
			return fizzy;
		}
};