package JavaGame;
import java.util.Random;
import java.util.Scanner;


public class Forge {

        public static Random rand = new Random();





    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while(true){
        System.out.println("Welcome to your Forge Please Select the Tier of item you would like to Make");
        System.out.println("1. Wood");
        System.out.println("2. Stone");
        System.out.println("3. Iron");
        System.out.println("4. Steel");
        System.out.println("5. Mythril");
        System.out.println("6. Adamanatite");
        System.out.println("7. Exit");
        int choice = keyboard.nextInt();


   
        keyboard.close();
        }
        
    }
}









