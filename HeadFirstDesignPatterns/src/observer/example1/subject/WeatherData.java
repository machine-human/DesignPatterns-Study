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
	
	// 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알림
	public void measurementsChanged() {
		this.notifyObservers();

	}

	public void setMeasurementsChanged(float t, float h, float p) { // 값이 세팅된다고 가정.
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementsChanged();
	}

	// 옵저버가 등록을 하면 목록 맨 뒤에 추가
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	// 옵저버가 탈퇴 신청을 하면 목록에서 제거
	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}
	
	// 상태에 대해서 모든 옵저버들한테 알려주는 부분
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

}
