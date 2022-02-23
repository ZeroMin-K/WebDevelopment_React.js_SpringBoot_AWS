package chapter02;

public class Ex2_1 {

}

class TodoService {
	private final FileTodoPersistence persistence;
	
	public TodoService() {
		this.persistence = new FileTodoPersistence();
	}
	
	public void create() {
		persistence.create();
	}
}
