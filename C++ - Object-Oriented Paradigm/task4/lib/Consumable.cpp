class Consumable {
	private:
		string name;
		double price;
	public:
		/* --- Constructors --- */
		Consumable(string inputName, double inputPrice) {
			name = inputName;
			price = inputPrice;
		}

		Consumable() {

		}
		
		/* --- Getters --- */
		string getName() {
			return name;
		}

		double getPrice() {
			return price;
		}
};