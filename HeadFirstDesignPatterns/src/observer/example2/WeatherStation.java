package observer.example2;

import observer.example2.observer.CurrentConditions;
import observer.example2.observable.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditions currentConditions = new CurrentConditions(weatherData);
		
		weatherData.setMeasurementsChanged(80, 65, 30.4f);
		weatherData.setMeasurementsChanged(82, 70, 29.2f);
		weatherData.setMeasurementsChanged(78, 90, 30.4f);
	}

}
