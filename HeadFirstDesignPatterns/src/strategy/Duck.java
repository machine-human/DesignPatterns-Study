package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("물에 떠있습니다.");
	}

	public abstract void display();
	
	// QuackBehavior 인터페이스로 소리 내는 행동 위임
	public void performQuack() {
		quackBehavior.quack();
	}

	// FlyBehavior 인터페이스로 나는 행동 위임
	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
