package observer.example1;

// Observer �������̽��� ��� ������ Ŭ�������� �����ؾ� ��
// ���� ��� �������� update() �޼ҵ带 �����ؾ���
// ���������� ������ ����
public interface Observer {
	void update(float temp, float humidity, float pressure);
}
