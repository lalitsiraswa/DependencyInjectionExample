package guru.springframework.DIExample;

import guru.springframework.DIExample.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		System.out.println("------------------------ PRIMARY BEAN -----------------------------");
		MyController myController = (MyController) ctx.getBean("myController");
//		String greeting = myController.sayHello();
//		System.out.println(greeting);
		System.out.println(myController.sayHello());
		System.out.println("------------------Property Based Dependency Injection--------------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------Setter Based Dependency Injection--------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------Constructor Based Dependency Injection--------------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("--------------------------- SPRING PROFILE ---------------------------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("--------------------------- PER SERVICE ASSIGNMENT ---------------------------------");
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println(petController.whichPetIsTheBest());
	}
}
