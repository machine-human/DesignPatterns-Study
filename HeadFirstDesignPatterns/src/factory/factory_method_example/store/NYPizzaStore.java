package factory.factory_method_example.store;

import factory.factory_method_example.Pizza;
import factory.factory_method_example.PizzaStore;
import factory.factory_method_example.pizza.NYStyleCheesePizza;
import factory.factory_method_example.pizza.NYStyleClamPizza;
import factory.factory_method_example.pizza.NYStylePepperoniPizza;
import factory.factory_method_example.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	// ��� ���� Ŭ���� ��ü�� �ν��Ͻ��� ���� ���������� �������� PizzaStore�� ����Ŭ������ ���� ������
	// ����Ŭ������ �ִ� orderPizza() �޼ҵ�� � ���ڰ� ����������� ���� �� �� ����
	// (�� �޼ҵ�� ���ڸ� �غ��ϰ� ���� �ڸ��� �� �۾��� ó���� ��)
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
