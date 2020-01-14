package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		name = "NY Style VeggiePizza"; 
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Veggie");
	}
}
