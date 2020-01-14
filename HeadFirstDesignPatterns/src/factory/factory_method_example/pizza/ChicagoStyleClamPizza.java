package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style ClamPizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Clam");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
