package guru.springframework.DIExample.config;
import guru.springframework.DIExample.controllers.ConstructorInjectedController;
import guru.springframework.DIExample.controllers.PropertyInjectedController;
import guru.springframework.DIExample.controllers.SetterInjectedController;
import guru.springframework.DIExample.services.ConstructorInjectedGreetingService;
import guru.springframework.DIExample.services.PropertyInjectedGreetingService;
import guru.springframework.DIExample.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    // By-default the name of the Bean created/Generated by the Application/Spring context is
    // the name of the Method eg(constructorInjectedGreetingService, propertyInjectedGreetingService)

//    @Bean
//    ConstructorInjectedController constructorInjectedController(){
//        return new ConstructorInjectedController();
//    }

    @Bean
    SetterInjectedController setterInjectedController(){
        return new SetterInjectedController();
    }
    @Bean
    PropertyInjectedController propertyInjectedController(){
        return new PropertyInjectedController();
    }
    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
