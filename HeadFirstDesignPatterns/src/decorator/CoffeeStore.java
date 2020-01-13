package decorator;

import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

public class CoffeeStore {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " cost : " + beverage.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " cost : " + beverage2.cost());
	}

}
