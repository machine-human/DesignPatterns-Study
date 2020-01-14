package factory.factory_method_example.pizza;

import factory.factory_method_example.Pizza;

public class NYStylePepperoniPizza extends Pizza{
	public NYStylePepperoniPizza() {
		name = "NY Style PepperoniPizza"; 
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Pepperoni");
	}
}
