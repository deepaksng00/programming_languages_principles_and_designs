class Pizza : public Food {
	private:
		string topping;
	public:
		/* --- Constructor --- */
		Pizza(string inputName, double inputPrice, int inputCalories, string inputTopping):Food(inputName, inputPrice, inputCalories) {
			topping = inputTopping;
		}

		/* --- Getters --- */
		string getTopping() {
			return topping;
		}
};