package guru.springframework.DIExample;

import guru.springframework.DIExample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}
}
