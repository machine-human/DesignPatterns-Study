package factory.factory_method_example;

public abstract class PizzaStore {
	
	// orderPizza(String type) 메소드는 서브클래스가 아닌
	// PizzaStore 추상 클래스에서 정의
	// 따라서 실제로 어떤 서브클래스에서 코드를 실행시키고 피자를 만드는지 알 수 없음
	// 즉, Pizza 객체를 이용해서 여러 작업을 하지만, 
	// Pizza는 추상 클래스이기 때문에 orderPizza()에서 실제로 어떤 구상 클래스에서 작업이 처리되고 있는지 전혀 알 수 없음
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// 팩토리 객체가 아닌 PizzaStore에 있는 createPizza() 호출
		// pizza 객체를 받았지만 어느 구상 클래스의 객체인지는 전혀 알지 못함
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// 팩토리 객체 대신 이 메소드를 사용 (팩토리 메소드)
	// 클래스의 인스턴스를 만드는 일을 서브클래스에게 위임
	// 객체를 생성하는 작업을 서브클래스에 캡슐화
	// 수퍼클래스에 있는 클라이언트 코드와 서브클래스에 있는 객체 생성 코드를 분리
	protected abstract Pizza createPizza(String type);
}
