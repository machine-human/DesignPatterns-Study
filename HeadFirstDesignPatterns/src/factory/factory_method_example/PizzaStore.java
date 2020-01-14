package factory.factory_method_example;

public abstract class PizzaStore {
	
	// orderPizza(String type) �޼ҵ�� ����Ŭ������ �ƴ�
	// PizzaStore �߻� Ŭ�������� ����
	// ���� ������ � ����Ŭ�������� �ڵ带 �����Ű�� ���ڸ� ������� �� �� ����
	// ��, Pizza ��ü�� �̿��ؼ� ���� �۾��� ������, 
	// Pizza�� �߻� Ŭ�����̱� ������ orderPizza()���� ������ � ���� Ŭ�������� �۾��� ó���ǰ� �ִ��� ���� �� �� ����
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// ���丮 ��ü�� �ƴ� PizzaStore�� �ִ� createPizza() ȣ��
		// pizza ��ü�� �޾����� ��� ���� Ŭ������ ��ü������ ���� ���� ����
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// ���丮 ��ü ��� �� �޼ҵ带 ��� (���丮 �޼ҵ�)
	// Ŭ������ �ν��Ͻ��� ����� ���� ����Ŭ�������� ����
	// ��ü�� �����ϴ� �۾��� ����Ŭ������ ĸ��ȭ
	// ����Ŭ������ �ִ� Ŭ���̾�Ʈ �ڵ�� ����Ŭ������ �ִ� ��ü ���� �ڵ带 �и�
	protected abstract Pizza createPizza(String type);
}
