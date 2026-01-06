package kabagambe.demo;

import kabagambe.demo.entities.Profile;
import kabagambe.demo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		var user= User.builder()
				.name("noah")
				.password("pass")
				.email("example@gmail.com")
				.build();




		System.out.println(user);

/*
		user.addTag("tag1");



var address= Address.builder()
		.street("rukomo")
		.city("rwanda")
		.state("nyundo")
		.zip("000")
		.build();

user.addAddress(address);
		System.out.println(user);
*/
	}

}
