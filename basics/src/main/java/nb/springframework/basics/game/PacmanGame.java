package nb.springframework.basics.game;

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
