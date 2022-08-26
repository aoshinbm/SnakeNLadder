import java.util.Random;

public class SnakeLadderUC6 {
    public static void main(String args[]) {
        int dice1;
        int position = 0, reach = 0, count=1;
        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Dice rolls ");

        while (position != 100) {
            dice1 = rand.nextInt(6);
            count++;
            position += dice1;
            System.out.println(" " + position);
        }
        System.out.println("Hurray Winner!! " + position);
        System.out.println("Total dice roll" + count);

    }
}

