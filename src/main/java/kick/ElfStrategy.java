package kick;

import lotr.Character;

public class ElfStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getHp()> whoKick.getHp()){
            opponent.setHp(opponent.getHp()-1);
        }else{
            opponent.setHp(0);
            System.out.println("I kiiled my enemy!\t😈");
        }
    }
    
}
