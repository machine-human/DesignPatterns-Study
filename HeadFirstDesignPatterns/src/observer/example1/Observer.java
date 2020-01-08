package observer.example1;

// Observer 인터페이스는 모든 옵저버 클래스에서 구현해야 함
// 따라서 모든 옵저버는 update() 메소드를 구현해야함
// 옵저버한테 값들을 전단
public interface Observer {
	void update(float temp, float humidity, float pressure);
}
