package observer.example1.subject;

import java.util.ArrayList;
import java.util.List;

import observer.example1.Observer;
import observer.example1.Subject;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	{
		this.observers = new ArrayList<>();
	}
	
	// ��� �����̼����κ��� ���ŵ� ����ġ�� ������ ������������ �˸�
	public void measurementsChanged() {
		this.notifyObservers();

	}

	public void setMeasurementsChanged(float t, float h, float p) { // ���� ���õȴٰ� ����.
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementsChanged();
	}

	// �������� ����� �ϸ� ��� �� �ڿ� �߰�
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	// �������� Ż�� ��û�� �ϸ� ��Ͽ��� ����
	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}
	
	// ���¿� ���ؼ� ��� ������������ �˷��ִ� �κ�
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

}
