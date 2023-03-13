package nb.springframework.basics02.DInj01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
   // @Autowired //Field Injection
    Dep1 dep1;
    //@Autowired //Field Injection
    Dep2 dep2;

    @Autowired
    public YourBusinessClass(Dep1 dep1,Dep2 dep2){ // Constructor Injection
        this.dep1=dep1;
        this.dep2=dep2;
    }
   // @Autowired // Setters Injection
    public void setDep1(Dep1 dep1) {
        this.dep1 = dep1;
    }

   // @Autowired // Setters Injection
    public void setDep2(Dep2 dep2) {
        this.dep2 = dep2;
    }

    @Override
    public String toString() {
        return "YourBusinessClass{" +
                "dep1=" + dep1 +
                ", dep2=" + dep2 +
                '}';
    }
}
@Component
class Dep1{

}
@Component
class Dep2{

}
@Configuration
@ComponentScan("nb.springframework.basics02.DInj01") // it can also perform component scan on same package I don't need to specify
public class DInjLauncherApplication {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(DInjLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
