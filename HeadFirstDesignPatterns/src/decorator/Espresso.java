package decorator;

import decorator.Beverage;

public class Espresso extends Beverage{
	// Ŀ�� �̸�
	public Espresso() {
		description = "����������";
	}
	
	// Ŀ�� ����
	@Override
	public int cost() {
		return 3500;
	}

}
