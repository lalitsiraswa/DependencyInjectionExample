package guru.springframework.DIExample;

import guru.springframework.DIExample.controllers.ConstructorInjectedController;
import guru.springframework.DIExample.controllers.MyController;
import guru.springframework.DIExample.controllers.PropertyInjectedController;
import guru.springframework.DIExample.controllers.SetterInjectedController;
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
		System.out.println("------------------Property Based Dependency Injection--------------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------Setter Based Dependency Injection--------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------Setter Based Dependency Injection--------------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
