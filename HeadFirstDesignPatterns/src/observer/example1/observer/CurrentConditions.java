package observer.example1.observer;

import observer.example1.DisplayElement;
import observer.example1.Observer;
import observer.example1.Subject;

// WeatherData 객체로부터 변경 사항을 받기 위해 Observer를 구현,
// API 구조상 모든 디스플레이 항목에서 DisplayElement를 구현하기로 했기 때문에 DisplayElement 구현
public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// 생성자에 weatherData라느 주제 객체가 전달되며, 그 객체를 사용하여 디스플레이를 옵저버로 등록
	public CurrentConditions(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	// 가장 최근에 얻는 기온과 습도를 출력
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + " , " + humidity);
	}
	
	// update()가 호출되면 기온과 습도를 저장하고 display()를 호출
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}
}
