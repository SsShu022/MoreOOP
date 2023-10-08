package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class CharacterFactory {
    
    public static Character createCharacter() throws InstantiationException, IllegalAccessException{
    
        List<Class<? extends Character>> characters = Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}
