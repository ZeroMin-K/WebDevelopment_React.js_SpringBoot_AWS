package chapter02;

public class Ex2_3 {

}

public class TodoService {
	private final ITodoPersistence persistence;	// �������̽�
	
	public TodoService(ITodoPersistence persistence) {
		this.persistence = persistence;
	}
	
	public void create() {
		persistence.create();
	}
}