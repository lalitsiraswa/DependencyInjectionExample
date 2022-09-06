package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
//    @Autowired Optional For Constructor Based Dependency injection
    private final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
//    public MyController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public String sayHello() {
//        System.out.println("Hello World");
//        return "Hello Guy's";
//        ---------------------------
        return greetingService.sayGreeting();
    }
}
