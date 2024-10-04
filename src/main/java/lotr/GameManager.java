package lotr;
public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("The fight is between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " hit " + c2.getClass().getSimpleName());
            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " hit " + c1.getClass().getSimpleName());
                c2.kick(c1);
            }

            System.out.println("Results of the round: " +
                    c1.getClass().getSimpleName() + " HP: " + c1.getHp() +
                    ", " + c2.getClass().getSimpleName() + " HP: " + c2.getHp());
            System.out.println(" ");
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " won!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " won!");
        }
    }
}