package chapter02;

public class Ex2_12 {

}

@RestController // JSON�� �����ϴ� ���������� ���
public class HelloController {
	@GetMapping("/test")		// path����, GET�޼��� ���
	public String process(@RequestParam String name) {
		// ����Ͻ� ���� 
		return "test" + name;
	}
}
