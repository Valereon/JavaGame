package JavaGame;

import java.util.Scanner;

public class Anvil {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the anvil");
        System.out.println("1. Upgrade");
        System.out.println("2. Repair");
        System.out.println("3. Reforge");
        System.out.println("4. Exit");
        int choice = keyboard.nextInt();
        if(choice == 1){
            upgrade(args);
        // }else if(choice == 2){
        //     repair(args);
        // }else if(choice == 3){
        //     reforge(args);
        }else{
            TextGame.shack(args);
        }

        keyboard.close();
    }

    public static void upgrade(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to upgrade?");
        System.out.println("1. Swords");
        System.out.println("2. Helmets");
        System.out.println("3. Chestplates");
        System.out.println("4. Leggings");
        System.out.println("5. Boots");
        System.out.println("6. Rings");
        System.out.println("7. Exit");
        int choice = keyboard.nextInt();
        if(choice == 1){
            swords(args);
        }
        // if(choice == 2){
        //     helmets(args);
        // }
        // if(choice == 3){
        //     chestplates(args);
        // }
        // if(choice == 4){
        //     leggings(args);
        // }
        // if(choice == 5){
        //     boots(args);
        // }
        // if(choice == 6){
        //     rings(args);
        // }
        // if(choice == 7){
        //     main(args);
        // }

        keyboard.close();
    }
    public static void swords(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to upgrade?");
        


        keyboard.close();
    }

    public static void repair(String[] args){
        System.out.println("What would you like to repair?");

        
    }




}
