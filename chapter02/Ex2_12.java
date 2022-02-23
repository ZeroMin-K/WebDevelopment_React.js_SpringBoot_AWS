package chapter02;

public class Ex2_12 {

}

@RestController // JSON을 리턴하는 웹서비스임을 명시
public class HelloController {
	@GetMapping("/test")		// path설정, GET메서드 사용
	public String process(@RequestParam String name) {
		// 비즈니스 로직 
		return "test" + name;
	}
}
