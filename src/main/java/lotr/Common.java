package lotr;
import java.util.Random;

class Common extends Character{
        
    public Common(int power, int hp) {
        super(power, hp);
    }

    public void dealRandomDamage(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(this.getPower()) + 1);
    }
    
}
