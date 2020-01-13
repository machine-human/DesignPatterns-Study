package decorator.decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ũ��";
	}

	@Override
	public int cost() {
		return 500 + beverage.cost();
	}

}
