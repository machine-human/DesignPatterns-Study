package decorator;

import decorator.Beverage;

public class HouseBlend extends Beverage{
	// Ŀ�� �̸�
	public HouseBlend() {
		description = "�Ͽ콺����";
	}
	
	// Ŀ�� ����
	@Override
	public int cost() {
		return 2000;
	}

}
