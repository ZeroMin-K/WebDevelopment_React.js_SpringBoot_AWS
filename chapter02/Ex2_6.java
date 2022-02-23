package chapter02;

public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITodoPersistence persistence = new FileTodoPersistence();
		TodoService service = new TodoService();
		service.setITodoPersistence(persistence);
	}

}
