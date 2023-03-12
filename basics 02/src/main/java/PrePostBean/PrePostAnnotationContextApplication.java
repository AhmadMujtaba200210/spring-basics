package PrePostBean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

@Component
class SomeClass{

}


@ComponentScan
@Configuration
public class PrePostAnnotationContextApplication {

    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
