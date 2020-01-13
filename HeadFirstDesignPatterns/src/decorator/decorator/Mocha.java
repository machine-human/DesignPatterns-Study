package decorator.decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	// ���ΰ��� �ϴ� ���Ḧ �����ϱ� ���� �ν��Ͻ� ����
	private Beverage beverage;
	
	// �ν��Ͻ� ������ ���ΰ��� �ϴ� ��ü�� �����ϱ� ���� ��������
	// ���ڷ������� �����ڿ� ���ΰ��� �ϴ� ���� ��ü�� �����ϴ� ���
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// ����ϰ� �̾��� ��ü�� �۾��� ������ ����, ����� "��ī"�� �߰� �� �����ϴ� ���
	@Override
	public String getDescription() {
		return beverage.getDescription()+", ��ī";
	}

	// ��ī�� �߰��� ���� ���
	// ����ϰ� �ִ� ��ü�� ������ ���ϴ� �۾��� �����ؼ�
	// ���� ��ü�� ���� ���� ��, ��ī ������ ���ϰ�, ���� �����ϴ� ���
	@Override
	public int cost() {
		return 500 + beverage.cost();
	}

}
