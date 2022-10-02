package guru.springframework.DIExample.services;
import org.springframework.stereotype.Service;

//@Service
//@Component
//@Controller
//@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
