package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style PepperoniPizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Pepperon");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
