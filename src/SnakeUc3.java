import java.util.Random;

public class SnakeUc3 {

    public static void main(String args[]) {
        int dice1;
        int position = 0;
//        int IS_Ladder=1;
//        int IS_Snake=2;
        Random rand = new Random();
        System.out.println("Start the game");
        dice1 = rand.nextInt(6) + 1;
        System.out.println("Dice rolls "+dice1);

        int choose = (int) (Math.random() * 10) % 3;
        System.out.println("Choice "+choose);
        switch (choose) {
            case 1: System.out.println("Whooo Ladder..!!");
                    position += dice1;
                    while ((position+dice1) != 100) {
                        dice1 = rand.nextInt(6) + 1;
                        System.out.println("Dice rolls "+dice1);
                        position += dice1;
                    }
                System.out.println("Position " +position);
                break;
            case 2: System.out.println("Ohhhh Nooo Snake..!!");
                while ((position-dice1) != 0) {
                    position -= dice1;
                }
                System.out.println("Position " +position);
                break;
            default: System.out.println("Invalid choice..!!!!");
                    break;
        }
    }
}
