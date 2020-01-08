package observer.example1;

public interface Subject {
	// Observer를 인자로 받아 등록하고 제거하는 역할
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	
	// 주체 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메소드
	void notifyObservers();
}
