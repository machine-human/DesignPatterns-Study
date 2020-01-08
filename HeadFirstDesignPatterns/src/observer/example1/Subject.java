package observer.example1;

public interface Subject {
	// Observer�� ���ڷ� �޾� ����ϰ� �����ϴ� ����
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	
	// ��ü ��ü�� ���°� ����Ǿ��� �� ��� ������������ �˸��� ���� ȣ��Ǵ� �޼ҵ�
	void notifyObservers();
}
