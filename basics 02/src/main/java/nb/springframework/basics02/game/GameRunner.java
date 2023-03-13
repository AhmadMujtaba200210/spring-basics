package nb.springframework.basics02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole gameRunner;
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole gameRunner){
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
