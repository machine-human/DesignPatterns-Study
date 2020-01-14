package factory.factory_method_example;

import factory.factory_method_example.store.ChicagoPizzaStore;
import factory.factory_method_example.store.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza nyStylePizza = nyStore.orderPizza("cheese");
		System.out.println(nyStylePizza.getname());
		System.out.println();

		Pizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
		System.out.println(chicagoStylePizza.getname());
		System.out.println();
	}

}
