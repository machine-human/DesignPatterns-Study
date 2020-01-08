package observer.example1.observer;

import observer.example1.DisplayElement;
import observer.example1.Observer;
import observer.example1.Subject;

// WeatherData ��ü�κ��� ���� ������ �ޱ� ���� Observer�� ����,
// API ������ ��� ���÷��� �׸񿡼� DisplayElement�� �����ϱ�� �߱� ������ DisplayElement ����
public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// �����ڿ� weatherData��� ���� ��ü�� ���޵Ǹ�, �� ��ü�� ����Ͽ� ���÷��̸� �������� ���
	public CurrentConditions(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	// ���� �ֱٿ� ��� ��°� ������ ���
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + " , " + humidity);
	}
	
	// update()�� ȣ��Ǹ� ��°� ������ �����ϰ� display()�� ȣ��
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}
}
