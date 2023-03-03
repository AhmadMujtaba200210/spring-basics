package nb.springframework.basics.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Sit Down");
    }

    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Shot at a bullet");
    }
}
