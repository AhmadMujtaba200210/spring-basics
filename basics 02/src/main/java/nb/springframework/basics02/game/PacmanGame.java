package nb.springframework.basics02.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Bend");
    }

    @Override
    public void left() {
        System.out.println("Sprint");
    }

    @Override
    public void right() {
        System.out.println("Stop");
    }
}
