package JavaGame;
import java.util.Scanner;

public class Chest {
    public static void main(String[] args) {
        System.out.println("Welcome to your Chest!");
        System.out.println("1. Store items");
        System.out.println("2. Retrieve items");
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
    
    public static void disp(String[] args){
        String InvLeftAlignFormat = "|%-33s |%-8d|%-9d|%-7d|%-11s|";
        String ChestLeftAlignFormat = "%-12s |%-33s |%-8d|%-9d|%-7d|%-11s|%n";
        String BottomChestAlign = "+----------------------------------+--------+---------+-------+-----------+%-12s+----------------------------------+--------+---------+-------+-----------+%n";
        Boolean hasPrinted = false;
        System.out.format("+-------------------------------------------------------------------------+             +-------------------------------------------------------------------------+%n");
        System.out.format("|Inventory                                                                |             |Chest                                                                    |%n");
        System.out.format("+----------------------------------+--------+---------+-------+-----------+             +----------------------------------+--------+---------+-------+-----------+%n");
        System.out.format("| Item                             | Weight | Dmg/Def | Value | Durability|             | Item                             | Weight | Dmg/Def | Value | Durability|%n");
        System.out.format("+----------------------------------+--------+---------+-------+-----------+             +----------------------------------+--------+---------+-------+-----------+%n");

        
        Inventory.overallWeight = 0;
        for(int i = 1; i < Inventory.chestWeight.size(); i++){
            if(i < Inventory.weight.size()){
                System.out.format(InvLeftAlignFormat, i + "." + Inventory.mods[Integer.valueOf(Inventory.mod.get(i))] + " " + Inventory.tiers[Integer.valueOf(Inventory.tier.get(i))] + " " +Inventory.items[Integer.valueOf(Inventory.type.get(i))] , Integer.valueOf(Inventory.weight.get(i)), Integer.valueOf(Inventory.dmgDef.get(i)), Integer.valueOf(Inventory.value.get(i)), Integer.valueOf(Inventory.durabilty.get(i)) + "/" + Integer.valueOf(Inventory.maxDurabilty.get(i)));
                Inventory.overallWeight += Integer.valueOf(Inventory.weight.get(i));
            }
            if(i == Inventory.weight.size()){
                System.out.format("+----------------------------------+--------+---------+-------+-----------+"); 
                
                System.out.format(ChestLeftAlignFormat, "", i + "." +  Inventory.mods[Integer.valueOf(Inventory.chestMod.get(i))] + " " + Inventory.tiers[Integer.valueOf(Inventory.chestTier.get(i))] + " " + Inventory.items[Integer.valueOf(Inventory.chestType.get(i))] , Integer.valueOf(Inventory.chestWeight.get(i)), Integer.valueOf(Inventory.chestDmgDef.get(i)), Integer.valueOf(Inventory.chestValue.get(i)), Integer.valueOf(Inventory.chestDurabilty.get(i)) + "/" + Integer.valueOf(Inventory.chestMaxDurabilty.get(i)));
                
                ChestLeftAlignFormat = "%-87s |%-33s |%-8d|%-9d|%-7d|%-11s|%n";
                i++;
                
            }
            
            System.out.format(ChestLeftAlignFormat, "", i + "." + Inventory.mods[Integer.valueOf(Inventory.chestMod.get(i))] + " " + Inventory.tiers[Integer.valueOf(Inventory.chestTier.get(i))] + " " + Inventory.items[Integer.valueOf(Inventory.chestType.get(i))] , Integer.valueOf(Inventory.chestWeight.get(i)), Integer.valueOf(Inventory.chestDmgDef.get(i)), Integer.valueOf(Inventory.chestValue.get(i)), Integer.valueOf(Inventory.chestDurabilty.get(i)) + "/" + Integer.valueOf(Inventory.chestMaxDurabilty.get(i)));
          
        }
        if(Inventory.weight.size() == Inventory.chestWeight.size()){
            hasPrinted = true;
            System.out.format("+----------------------------------+--------+---------+-------+-----------+             +----------------------------------+--------+---------+-------+-----------+%n");
        }
        if(hasPrinted == false){
            System.out.format(BottomChestAlign, "");
        }
        System.out.format("Weight: " + Inventory.overallWeight + "/" + Inventory.maxWeight);
                     
        
        
        


        
    }
    public static void store(String[] args) {
        
        disp(args);
        System.out.println();
        System.out.println("What item would you like to store? (Enter a number or Enter 0 to exit)");
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        if(choice == 0){
            CSVIO.chestWrite(args);
            main(args);
            

        }
        if(choice > Inventory.weight.size()){
            System.out.println("Invalid choice");
            store(args);
        }
        else{
            Inventory.chestWeight.add(Inventory.weight.get(choice));
            Inventory.chestMod.add(Inventory.mod.get(choice));
            Inventory.chestTier.add(Inventory.tier.get(choice));
            Inventory.chestType.add(Inventory.type.get(choice));
            Inventory.chestDmgDef.add(Inventory.dmgDef.get(choice));
            Inventory.chestValue.add(Inventory.value.get(choice));
            Inventory.chestDurabilty.add(Inventory.durabilty.get(choice));
            Inventory.chestMaxDurabilty.add(Inventory.maxDurabilty.get(choice));
            Inventory.tempChestWeight.add(Inventory.weight.get(choice));
            Inventory.tempChestMod.add(Inventory.mod.get(choice));
            Inventory.tempChestTier.add(Inventory.tier.get(choice));
            Inventory.tempChestType.add(Inventory.type.get(choice));
            Inventory.tempChestDmgDef.add(Inventory.dmgDef.get(choice));
            Inventory.tempChestValue.add(Inventory.value.get(choice));
            Inventory.tempChestDurabilty.add(Inventory.durabilty.get(choice));
            Inventory.tempChestMaxDurabilty.add(Inventory.maxDurabilty.get(choice));
            Inventory.weight.remove(choice);
            Inventory.mod.remove(choice);
            Inventory.tier.remove(choice);
            Inventory.type.remove(choice);
            Inventory.dmgDef.remove(choice);
            Inventory.value.remove(choice);
            Inventory.durabilty.remove(choice);
            Inventory.maxDurabilty.remove(choice);
            store(args);
        }
        
    }
    
}
