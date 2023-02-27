package nb.springframework.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        //2: Configuration Class
       var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("noName"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }
}
