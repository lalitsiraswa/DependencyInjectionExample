package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Service
//@Component
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
//    @Autowired It is option here (There is no requirement of @Autowired in constructor based dependency injection)
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
