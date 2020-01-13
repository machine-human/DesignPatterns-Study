package decorator.decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	// 감싸고자 하는 음료를 저장하기 위한 인스턴스 변수
	private Beverage beverage;
	
	// 인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 새엇ㅇ자
	// 데코레이터의 생성자에 감싸고자 하는 음료 객체를 전달하는 방식
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// 장식하고 이쓴ㄴ 객체에 작업을 위임한 다음, 결과에 "모카"를 추가 후 리턴하는 방식
	@Override
	public String getDescription() {
		return beverage.getDescription()+", 모카";
	}

	// 모카를 추가한 가격 계산
	// 장식하고 있는 객체에 가격을 구하는 작업을 위임해서
	// 음료 자체의 값을 구한 후, 모카 가격으 더하고, 합을 리턴하는 방식
	@Override
	public int cost() {
		return 500 + beverage.cost();
	}

}
