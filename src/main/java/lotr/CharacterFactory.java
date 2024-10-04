package lotr;
import java.util.Random;

public class CharacterFactory{
    public Character createCharacter(){
        int num = new Random().nextInt(4);
        switch (num) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            default:
                return new Knight();
        }

    }
}