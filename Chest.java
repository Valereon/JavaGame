package JavaGame;
import java.util.Scanner;

public class Chest {
    public static void main(String[] args) {
        System.out.println("Welcome to your Chest!");
        System.out.println("1. Store items");
        System.out.println("2. Retrive items");
        System.out.println("3. Exit");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        if(choice == 1){
            store(args);
        }
        //else if(choice == 2){
        //     retrive(args);
        // }
        else if(choice == 3){
            TextGame.shack(args);
        }
        keyboard.close();
    }
    
    public static void store(String[] args){
        String leftAlignFormat = "|%-32s |%-8d|%-9d|%-7d|%-11s|%n";
        System.out.format("+------------------------------------------------------------------------+             +------------------------------------------------------------------------+%n");
        System.out.format("|Inventory                                                               |             |Chest                                                                   |%n");
        System.out.format("+---------------------------------+--------+---------+-------+-----------+             +---------------------------------+--------+---------+-------+-----------+%n");
        System.out.format("| Item                            | Weight | Dmg/Def | Value | Durability|             | Item                            | Weight | Dmg/Def | Value | Durability|%n");
        System.out.format("+---------------------------------+--------+---------+-------+-----------+             +---------------------------------+--------+---------+-------+-----------+%n");


        


        // System.out.println("What would you like to store?");
        // System.out.println("0. Sticks: " + Inventory.stick);
        // System.out.println("1. String: "  + Inventory.string);
        // System.out.println("2. Wood: "  + Inventory.wood);
        // System.out.println("3. Stone: "  + Inventory.stone);
        // System.out.println("4. Iron: "  + Inventory.iron);
        // System.out.println("5. Steel: "  + Inventory.steel);
        // System.out.println("6. Mythril: "  + Inventory.mythril);
        // System.out.println("7. Adamantite: "  + Inventory.adamanatite);
        // System.out.println("8. Heart of the Mountin: "  + Inventory.heartOfTheMountain);
        
        Inventory.overallWeight = 0;
        for(int i = 1; i < Inventory.weight.size(); i++){
            System.out.format(leftAlignFormat, Inventory.mods[Integer.valueOf(Inventory.mod.get(i))] + " " + Inventory.tiers[Integer.valueOf(Inventory.tier.get(i))] + " " +Inventory.items[Integer.valueOf(Inventory.type.get(i))] , Integer.valueOf(Inventory.weight.get(i)), Integer.valueOf(Inventory.dmgDef.get(i)), Integer.valueOf(Inventory.value.get(i)), Integer.valueOf(Inventory.durabilty.get(i)) + "/" + Integer.valueOf(Inventory.maxDurabilty.get(i)));

            Inventory.overallWeight += Integer.valueOf(Inventory.weight.get(i));
        }
        System.out.format("+-------------------------------+--------+---------+-------+-----------+%n");
        
        System.out.println("Weight: " + Inventory.overallWeight + "/" + Inventory.maxWeight);
    
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();


        
    }
    
}
