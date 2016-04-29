package school.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import school.service.PersonService;

/**
 * Created by deepu on 29/7/15.
 */
@Configuration
@ComponentScan(basePackages = {"school.service"})
@EnableAspectJAutoProxy

public class BeanConfiguration {

    public BeanConfiguration()
    {
        System.out.println("In Bean Configuration...");
    }
    @Bean
    public PersonService personService()
    {
        System.out.println("Person Service Bean created  from BeanConfiguration...");
        return  new PersonService();
    }
}
