package lotr;

import java.util.Random;

import kick.KickStrategy;
import kick.KingStrategy;

public class Knight extends Character{

    public Knight() {
        super( rand(2, 12), rand(2, 12), new KingStrategy());
    }

      private static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    
}
