package observer.example2.observable;

import java.util.Observable;

// ������ ���/Ż�� ���� ���� �������� �ʾƵ� �Ǳ� ������ ���, �߰�, ���� ���� ���� �ڵ� ����
// Observable ����Ŭ�������� ���� ���ֱ� ����
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public void measurementsChanged() {
		// ���°� �ٲ���ٴ� �÷��װ��� �ٲ���
		this.setChanged();
		// Ǯ ����� ����ؼ� ���������� �˸�
		this.notifyObservers();
	}

	public void setMeasurementsChanged(float t, float h, float p) { // ���� ���õȴٰ� ����.
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
