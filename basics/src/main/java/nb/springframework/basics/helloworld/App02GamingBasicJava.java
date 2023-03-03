package nb.springframework.basics.helloworld;

import nb.springframework.basics.helloworld.Address;
import nb.springframework.basics.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        //2: Configuration Class
       var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("noName"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("person4Qualifier"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Address.class));

       // Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
