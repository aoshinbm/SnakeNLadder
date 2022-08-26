import java.util.Random;

public class SnakeLadderUC1 {
    public static void main(String[] args) {
            // TODO Auto-generated method stub

//		Random rand = new Random();
//		int x = rand. nextInt(7)%10;

            System.out.println("Snake & Ladder Game");
            int dice = (int)Math.floor(Math.random()*10)%7;
            System.out.println("Dice roll "+dice);

            if(dice==6)
            {
                System.out.println("Start the game from 1st position");
            }
            else
            {
                System.out.println("Better luck next time");
            }
        }
}
