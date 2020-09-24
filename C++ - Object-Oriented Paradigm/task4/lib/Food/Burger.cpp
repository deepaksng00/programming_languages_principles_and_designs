class Burger : public Food {
	private:
		string filling;
	public:
		/* --- Constructor --- */
		Burger(string inputName, double inputPrice, int inputCalories, string inputFilling):Food(inputName, inputPrice, inputCalories) {
			filling = inputFilling;
		}

		/* --- Getters --- */
		string getFilling() {
			return filling;
		}
};