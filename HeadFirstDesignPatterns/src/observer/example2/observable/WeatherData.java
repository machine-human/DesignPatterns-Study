package observer.example2.observable;

import java.util.Observable;

// 옵저버 등록/탈퇴 등일 직접 관리하지 않아도 되기 때문에 등록, 추가, 연락 등을 위한 코드 제거
// Observable 슈퍼클래스에서 전부 해주기 때문
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public void measurementsChanged() {
		// 상태가 바뀌었다는 플래그값을 바꿔줌
		this.setChanged();
		// 풀 방식을 사용해서 옵저버에게 알림
		this.notifyObservers();
	}

	public void setMeasurementsChanged(float t, float h, float p) { // 값이 세팅된다고 가정.
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
