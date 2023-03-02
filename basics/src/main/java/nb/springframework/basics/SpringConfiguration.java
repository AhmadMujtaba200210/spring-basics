package nb.springframework.basics;

import nb.springframework.basics.game.GameRunner;
import nb.springframework.basics.game.GamingConsole;
import nb.springframework.basics.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
//var game=new MarioGame();
    //var game=new SuperContraGame();
//        var game=new PacmanGame();
//        var gameRunner=new GameRunner(game);
//        gameRunner.run();
}
