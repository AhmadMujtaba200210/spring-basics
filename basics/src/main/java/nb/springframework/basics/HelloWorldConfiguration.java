package nb.springframework.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// To eleminating verbosity in java programs,
// java 16 sdk introduced the record.
record Person(String name ,int age,Address address){
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
        return new Person("Ahmad",15,new Address("Shalamabad","Dera Isamil Khan"));
    }

    @Bean
    public Person person2MethodCall(){ // we can create a new bean by using already created bean
        return new Person(
                noName(),
                age(),
                address()
        );
    }
    @Bean
    public Person person3Parameter(String name, int age,Address address3 ){ // we can create a new bean by using already created bean
        return new Person(
                name,
                age,
                address3
        );
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("Mohallah Hayatullah","Dera ismail khan");
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("MultiGardens B17","Islamabad");
    }
}
