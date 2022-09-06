package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

/*    public PropertyInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }*/
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
