package chapter02;

public class Ex2_3 {

}

public class TodoService {
	private final ITodoPersistence persistence;	// 인터페이스
	
	public TodoService(ITodoPersistence persistence) {
		this.persistence = persistence;
	}
	
	public void create() {
		persistence.create();
	}
}