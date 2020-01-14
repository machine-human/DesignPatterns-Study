package factory.factory_method_example.store;

import factory.factory_method_example.Pizza;
import factory.factory_method_example.PizzaStore;
import factory.factory_method_example.pizza.ChicagoStyleCheesePizza;
import factory.factory_method_example.pizza.ChicagoStyleClamPizza;
import factory.factory_method_example.pizza.ChicagoStylePepperoniPizza;
import factory.factory_method_example.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese"))
			pizza = new ChicagoStyleCheesePizza();

		if (type.equals("peper"))
			pizza = new ChicagoStylePepperoniPizza();

		if (type.equals("clam"))
			pizza = new ChicagoStyleClamPizza();

		if (type.equals("veggie"))
			pizza = new ChicagoStyleVeggiePizza();

		return pizza;
	}
}
