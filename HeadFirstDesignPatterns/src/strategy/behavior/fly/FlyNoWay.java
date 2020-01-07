package strategy.behavior.fly;

import strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못하고 걸어다닙니다.");
	}

}
