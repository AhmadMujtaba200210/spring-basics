package nb.springframework.basics02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("nb.springframework.basics02.game")
public class App03GamingBasicJava {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(App03GamingBasicJava.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
