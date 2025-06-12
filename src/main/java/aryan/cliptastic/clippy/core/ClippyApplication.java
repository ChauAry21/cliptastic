package aryan.cliptastic.clippy.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClippyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClippyApplication.class, args);
		System.out.println("hi");
	}

}
