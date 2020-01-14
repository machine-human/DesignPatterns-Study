package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		name = "NY Style CheesePizza"; 
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
