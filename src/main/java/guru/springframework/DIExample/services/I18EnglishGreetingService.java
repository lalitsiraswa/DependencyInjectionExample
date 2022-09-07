package guru.springframework.DIExample.services;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// i18nService is a Name Qualifier
@Profile("EN")
@Service("i18nService")
public class I18EnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - ENGLISH";
    }
}
