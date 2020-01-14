package factory.factory_method_example.store;

import factory.factory_method_example.Pizza;
import factory.factory_method_example.PizzaStore;
import factory.factory_method_example.pizza.NYStyleCheesePizza;
import factory.factory_method_example.pizza.NYStyleClamPizza;
import factory.factory_method_example.pizza.NYStylePepperoniPizza;
import factory.factory_method_example.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	// 어느 구상 클래스 객체의 인스턴스를 마들어서 리턴할지는 전적으로 PizzaStore의 서브클래스에 의해 결정됨
	// 수퍼클래스에 있는 orderPizza() 메소드는 어떤 피자가 만들어지는지 전혀 알 수 없음
	// (그 메소드는 피자를 준비하고 굽고 자르고 등 작업을 처리할 뿐)
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese"))
			pizza = new NYStyleCheesePizza();

		if (type.equals("peper"))
			pizza = new NYStylePepperoniPizza();

		if (type.equals("clam"))
			pizza = new NYStyleClamPizza();

		if (type.equals("veggie"))
			pizza = new NYStyleVeggiePizza();

		return pizza;
	}

}
