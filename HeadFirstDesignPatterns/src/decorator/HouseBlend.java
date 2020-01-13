package decorator;

import decorator.Beverage;

public class HouseBlend extends Beverage{
	// 커피 이름
	public HouseBlend() {
		description = "하우스블렌드";
	}
	
	// 커피 가격
	@Override
	public int cost() {
		return 2000;
	}

}
