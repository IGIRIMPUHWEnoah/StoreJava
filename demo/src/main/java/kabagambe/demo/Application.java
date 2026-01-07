package kabagambe.demo;

import kabagambe.demo.entities.Address;
import kabagambe.demo.entities.Profile;
import kabagambe.demo.entities.User;
import kabagambe.demo.repositories.AddressRepo;
import kabagambe.demo.repositories.userRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(Application.class, args);

	var repository=context.getBean(userRepository.class);

	var user=User.builder().username("Noah").email("naoh@gmail.com").password("1232@mama").build();

	repository.save(user);

	var addrepo=context.getBean(AddressRepo.class);

	var address= Address.builder().street("rukomo").state("karama").zip("123").build();

	addrepo.save(address);


	var add=addrepo.findById(1L).orElseThrow();
	addrepo.findAll().forEach(A-> System.out.println(A.getStreet()));

		System.out.println(add);


	}

}
