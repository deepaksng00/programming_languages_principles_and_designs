class Drink : virtual public Consumable {
	private:
		int volume;
	public:
		/* --- Constructor --- */
		Drink(string inputName, double inputPrice, int inputVolume):Consumable(inputName, inputPrice) {
			volume = inputVolume;
		}

		/* --- Getters --- */
		int getVolume() {
			return volume;
		}
};