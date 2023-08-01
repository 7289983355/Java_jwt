package com.dockerSample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@GetMapping("/getMsg")
	public String getMessage() {
		return "Docker Test Successful";
	}
}