#include <iostream>
using namespace std;

/* --- Import classes --- */
#include "lib/Consumable.cpp"
#include "lib/Food.cpp"
#include "lib/Drink.cpp"
#include "lib/Food/Pizza.cpp"
#include "lib/Food/Burger.cpp"
#include "lib/Drink/Alcoholic_Drink.cpp"
#include "lib/Drink/Soft_Drink.cpp"
#include "lib/Food_Drink/Soup.cpp"


int main() {
	Pizza * pizza = new Pizza("Margherita", 12.45, 1459, "Mozzarella");
	cout << pizza->getTopping();
}