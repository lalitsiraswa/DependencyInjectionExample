package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService()); // new SetterInjectedGreetingService
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}