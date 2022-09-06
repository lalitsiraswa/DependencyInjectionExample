package guru.springframework.DIExample.services;
import org.springframework.stereotype.Service;

//@Service
//@Component
//@Controller
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
