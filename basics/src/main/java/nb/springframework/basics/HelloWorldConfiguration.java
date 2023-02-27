package nb.springframework.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// To eleminating verbosity in java programs,
// java 16 sdk introduced the record.
record Person(String name ,int age){
}
record Address(String city ,String street){
}

// This class consist of Spring beans to be configured for whole application
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String noName(){
        return "Ahmad";
    }

    @Bean
    public int age(){
        return 14;
    }

    @Bean
    public Person person(){
        return new Person("Ahmad",15);
    }
    @Bean
    public Address address(){
        return new Address("Mohallah Hayatullah","Dera ismail khan");
    }
}
