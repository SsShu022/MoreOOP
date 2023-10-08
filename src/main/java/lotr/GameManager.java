package lotr;

public class GameManager{
    public void fight(Character character1, Character character2){
        System.out.println("The fight starts!");
        System.out.println(character1.toString() + " vs " + character2.toString());
        while(character1.getHp() > 0 && character2.getHp() > 0){
            System.out.println(character1.toString() + " kicks " + character2.toString() + "!");
            character1.kick(character2);
            System.out.println(character2.toString() + " has " + character2.getHp() + " Hp left");
            if (character2.getHp()<= 0){
                System.out.println(character2.toString() + " has died in a fight! What a shame!");
                break;
            }else{
                System.out.println(character2.toString() + " kicks " + character1.toString() + "!");
                character2.kick(character1);
                System.out.println(character1.toString() + " has " + character1.getHp() + " Hp left");
                if (character1.getHp()<= 0){
                    System.out.println(character1.toString() + " has perished in a fight!");
                    break;
                    }
            
            }
        }
    }
}
