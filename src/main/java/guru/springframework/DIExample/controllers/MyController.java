package guru.springframework.DIExample.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello World");
        return "Hello Guy's";
    }
}
