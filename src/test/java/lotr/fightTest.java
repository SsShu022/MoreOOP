package lotr;

import org.junit.jupiter.api.Test;


public class fightTest {
    @Test
    // Test for myself to see how game works
    public void testFight() throws InstantiationException, IllegalAccessException{
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        GameManager game = new GameManager();
        game.fight(character1, character2);

    }
}
