package JavaGame.Classes;

import java.util.Random;

public class Item {
    public static enum types {sword, bat, dagger};
    public static enum modifers {sharp, blunt, heavy, light, fast, slow, strong, weak};
    public static enum tiers {wood, stone, gold, iron, steel, mythril, adamantite};
    // private enum rareitys {common, uncommon, rare, legendary};
    // private enum elementalMods {none, fire, ice, poison, lightning};

    private types type;
    private modifers modifer;
    private tiers tier;
    private int damage;
    private int durability;
    private int maxDurability;
    private int value;
    private Random rand = new Random();

    public static Item createItem(){
        Item newItem = new Item();
        newItem.type = types.bat;
        newItem.tier = tiers.wood;
        newItem.modifer = modifers.blunt;
        newItem.damage = 1;
        newItem.durability = 10;
        newItem.maxDurability = 10;
        newItem.value = 1;
        return newItem;
    }



    // public Item(types type, tiers tier) {
    //     this.type = type;
    //     this.damage = random;
    //     this.durability = durability;
    //     this.maxDurability = Maxdurability;
    //     this.value = value;
    //     this.modifer = modifer;
    //     this.tier = tier;
    // }
    
    public types getType() {
        return type;
    }

    public void setType(types type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public modifers getModifer() {
        return modifer;
    }

    public void setModifer(modifers modifer) {
        this.modifer = modifer;
    }

    public tiers getTier() {
        return tier;
    }

    public void setTier(tiers tier) {
        this.tier = tier;
    }  

    public void reStat(int damage, int durability, int value, modifers modifer, tiers tier){
        this.damage = damage;
        this.durability = durability;
        this.maxDurability = durability;
        this.value = value;
        this.modifer = modifer;
        this.tier = tier;
    }

    public String toString(){
        return modifer.toString() + " " + tier.toString() + " " + type.toString() + " " + damage + " " + value + " " + durability + "/" + maxDurability;
    }

}
