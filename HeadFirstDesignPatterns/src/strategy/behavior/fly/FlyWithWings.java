package strategy.behavior.fly;

import strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날아다닙니다.");
	}

}
