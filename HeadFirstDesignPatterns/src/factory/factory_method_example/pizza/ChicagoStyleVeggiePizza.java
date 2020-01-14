package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style VeggiePizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Veggie");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
