import java.util.Random;

public class SnakeLadderUC5 {
    public static void main(String args[]){
        int dice1,position=0,reach=0;
        Random rand = new Random();
        System.out.println("Start the game");
        System.out.println("Dice rolls ");

//        while(position!=100){
            dice1 = rand.nextInt(6) ;
            reach=position+dice1;
            if(reach>100) {
                System.out.println("Cant move stay still..!!");
            }
            else if (reach<100) {
                dice1 = rand.nextInt(6) ;
                reach=position+dice1;
                System.out.println("Current position "+reach+" Move forward till reaches 100 ");
            }
            else {
            System.out.println("Hurray Winner.!! player reaches 100th position "+reach);
        }
}

}
