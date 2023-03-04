package nb.springframework.basics02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Hole");
    }

    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Accelerate");
    }

}
