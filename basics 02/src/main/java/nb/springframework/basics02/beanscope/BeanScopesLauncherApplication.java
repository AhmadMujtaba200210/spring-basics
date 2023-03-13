package nb.springframework.basics02.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}
@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);
        // each time we get same instance of bean from spring context bcz of scope defination

        System.out.println("context.getBean(NormalClass.class) = " + context.getBean(NormalClass.class));
        System.out.println("context.getBean(NormalClass.class) = " + context.getBean(NormalClass.class));

        // each time we get new instance of bean from spring context bcz of scope defination
        System.out.println("context.getBean(PrototypeClass.class) = " + context.getBean(PrototypeClass.class));
        System.out.println("context.getBean(PrototypeClass.class) = " + context.getBean(PrototypeClass.class));
        System.out.println("context.getBean(PrototypeClass.class) = " + context.getBean(PrototypeClass.class));
    }

           
}
