package lotr;
import java.util.Random;
import kick.KickStrategy;
import kick.KingStrategy;

public class King extends Character {

    public King() {
        super(rand(5, 15), rand(5, 15), new KingStrategy());
        //TODO Auto-generated constructor stub
    }

    private static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    
}
