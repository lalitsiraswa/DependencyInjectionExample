package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Service
//@Component
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

/*    public PropertyInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }*/
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
