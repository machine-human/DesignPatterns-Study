package decorator;

import decorator.Beverage;

public class Espresso extends Beverage{
	// 커피 이름
	public Espresso() {
		description = "에스프레소";
	}
	
	// 커피 가격
	@Override
	public int cost() {
		return 3500;
	}

}
