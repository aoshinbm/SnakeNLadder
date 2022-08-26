import java.util.Random;

public class SnakeLadderUC4 {
    public static void main(String args[]){
        int dice1,position=0,reach=0,dice2;
        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Dice rolls ");

        while(position!=100){
            dice2 = rand.nextInt(6) ;
            position+=dice2;
            System.out.println(" "+position);
        }
        System.out.println("Hurray Winner!! "+position);

    }
}
