package nb.springframework.basics;

import nb.springframework.basics.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        context.getBean(GamingConsole.class).up();
    }
}
