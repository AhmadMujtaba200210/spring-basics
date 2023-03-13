package nb.springframework.basics02.DInj02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("nb.springframework.basics02.DInj02") // it can also perform component scan on same package I don't need to specify
public class SpringContextLauncherApplication {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(SpringContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
