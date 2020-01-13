package decorator.decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", µŒ¿Ø";
	}

	@Override
	public int cost() {
		return 500 + beverage.cost();
	}

}
