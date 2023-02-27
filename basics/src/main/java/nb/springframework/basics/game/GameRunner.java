package nb.springframework.basics.game;

public class GameRunner {
    private GamingConsole gameRunner;
    public GameRunner(GamingConsole gameRunner){
        this.gameRunner=gameRunner;
    }


    public void run(){
        System.out.println("Running game: "+gameRunner);
        gameRunner.down();
        gameRunner.up();
        gameRunner.left();
        gameRunner.right();
    }
}
