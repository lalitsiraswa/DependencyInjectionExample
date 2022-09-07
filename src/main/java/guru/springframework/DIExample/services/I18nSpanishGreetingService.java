package guru.springframework.DIExample.services;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// i18nService is a Name Qualifier
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - SPANISH";
    }
}
