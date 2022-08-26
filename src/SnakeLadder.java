import java.util.Random;

public class SnakeLadder {

    int dice1,dice2,dice3,move,position;

    void playGame() {

        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Player1 starts the game");
        dice1 = rand.nextInt(7) % 10;
        System.out.println("Dice rolls " + dice1);
        if (dice1 == 6) {
            System.out.println("Current position is at 1 i.e. START at 1stposition  ");
            dice2 = rand.nextInt(7) % 10;
            System.out.println("Roll dice again " + dice2);
            if (dice2 == 6) {
                System.out.println("PLace next coin at the starting position");
                dice3 = rand.nextInt(7) % 10;
                System.out.println("Roll dice again " + dice3);
                if (dice3 == 6) {
                    System.out.println("Triple 6 is equal to null.");
                    System.out.println("Next player");
                } else {
                    move = dice2 + dice3;
                    System.out.println("Move forward " + move + " steps");
                }
            } else {
                System.out.println("Move forward " + dice2 + " steps");
            }
        } else {
            System.out.println("Next player");
        }
    }

    void Ladder(){
        Random rand = new Random();
//        System.out.println("Start the game");
        dice1 = rand.nextInt(6) + 1;
        System.out.println("Dice rolls "+dice1);

        int choose = (int) (Math.random() * 10) % 3;
        switch (choose) {
            case 1: System.out.println("Whooo Ladder..!!");
                while (position != 100) {
                    position += dice1;
                }
                System.out.println("Position " +position);
                break;
            case 2: System.out.println("Ohhhh Nooo Snake..!!");
                while (position != 0) {
                    position -= dice1;
                }
                System.out.println("Position " +position);
                break;
            default: System.out.println("Invalid choice..!!!!");
                break;
        }
    }
}

