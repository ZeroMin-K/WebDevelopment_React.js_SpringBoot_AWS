package chapter02;

public class Ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITodoPersistence persistence = new FileTodoPersistence();
		TodoServidce service = new TodoService(persistence);
		
	}

}