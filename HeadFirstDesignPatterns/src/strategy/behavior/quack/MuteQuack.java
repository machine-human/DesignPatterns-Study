package strategy.behavior.quack;

import strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("소리가 없습니다.");
	}
	
}
