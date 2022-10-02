package JavaGame;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static int wood = 10;
    public static int stone = 0;
    public static int iron = 0;
    public static int steel = 0;
    public static int mythril = 0;
    public static int adamanatite = 0;

    public static int stick = 10;
    public static int string = 10;
    public static int heartOfTheMountain = 0;

    public static int overallWeight = 0;
    public static int maxWeight = 250;



    public static List<String> weight =  new ArrayList<String>();
    public static List<String> dmgDef =  new ArrayList<String>();
    public static List<String> value =  new ArrayList<String>();
    public static List<String> mod =  new ArrayList<String>();
    public static List<String> tier =  new ArrayList<String>();
    public static List<String> type =  new ArrayList<String>();
    public static List<String> durabilty =  new ArrayList<String>();
    public static List<String> maxDurabilty =  new ArrayList<String>();
    public static String[] tiers = {"Wood", "Stone", "Iron", "Steel", "Mythril", "Adamanatite"};
    public static String[] items = {"Sword", "Helm", "Chestplate", "Leggings", "Boots", "Ring", "Sheild"};
    public static String[] mods = {"Heavy", "Light", "Sturdy", "Brittle", "Sharp", "Dull", "Shiny", "Rusty"};

    
    
    

    



    public static void main(String[] args){
        CSVIO.main("R",10,30,10076,6,4,5,300,3000);
        Chest.store(args);

    }

}

