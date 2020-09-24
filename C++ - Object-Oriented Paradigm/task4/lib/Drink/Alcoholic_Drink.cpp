class Alcoholic_Drink : public Drink {
	private:
		float ABV;
	public:
		/* --- Constructor --- */
		Alcoholic_Drink(string inputName, double inputPrice, int inputVolume, float inputABV):Drink(inputName, inputPrice, inputVolume) {
			ABV = inputABV;
		}

		/* --- Getters --- */
		float getABV() {
			return ABV;
		}
};