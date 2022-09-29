package guru.springframework.DIExample.controllers;

import guru.springframework.DIExample.services.ConstructorInjectedGreetingService;
import guru.springframework.DIExample.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedGreetingService(); // new PropertyInjectedGreetingService()
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}