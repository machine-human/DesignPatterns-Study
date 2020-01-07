package strategy;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("청둥오리 입니다.");
	}

}
