package lotr;
import java.util.Random;

public class King extends Common{
    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }
}