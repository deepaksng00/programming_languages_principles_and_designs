class Food : virtual public Consumable {
	private:
		int calories;
	public:
		/* --- Constructor --- */
		Food(string inputName, double inputPrice, int inputCalories):Consumable(inputName, inputPrice) {
			calories = inputCalories;
		}

		/* --- Getters --- */
		int getCalories() {
			return calories;
		}
};