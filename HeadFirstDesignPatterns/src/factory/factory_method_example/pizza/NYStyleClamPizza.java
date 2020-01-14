package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza() {
		name = "NY Style ClamPizza"; 
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Clam");
	}
}
