package in.faizan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.faizan.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PersonService ps = context.getBean(PersonService.class);
		// ps.savePerson();
		ps.getPerson();
	}

}
