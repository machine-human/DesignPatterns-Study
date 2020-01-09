package observer.example2.observer;

import java.util.Observable;
import java.util.Observer;

import observer.example2.DisplayElement;
import observer.example2.observable.WeatherData;

public class CurrentConditions implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;
	
	// Observable을 인자로 받은 다음 옵저버를 등록
	public CurrentConditions(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + " , " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}

}
