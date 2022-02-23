package chapter02;

public class Ex2_7 {
	@Test
	public void test() {
		ITodoPersistence persistence = new MockTodoPersistence();
		TodoService service = new TodoService(persistence);
	}
}