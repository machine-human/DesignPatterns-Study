package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("���� ���ֽ��ϴ�.");
	}

	public abstract void display();
	
	// QuackBehavior �������̽��� �Ҹ� ���� �ൿ ����
	public void performQuack() {
		quackBehavior.quack();
	}

	// FlyBehavior �������̽��� ���� �ൿ ����
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
