package chapter02;

public class Ex2_5 {

}

class TodoService {
	private final ITodoPersistence persistence;
	
	public void setITodoPersistence(ITodoPersistence persistence) {
		this.persistence = persistence;
	}
}
