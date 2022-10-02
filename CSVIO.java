package JavaGame;
import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVIO
{  

    
    public static void main(String RW, Integer Weight, Integer DamageDefense, Integer Value, Integer Mod, Integer Tier, Integer Type, Integer Durability, Integer MaxDurability){  
        String line = "";  
        String splitBy = ",";
        
        if(RW.equals("R")){
            
                try{ 
                    BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));  
                    
                    while ((line = br.readLine()) != null){  
                        String[] employee = line.split(splitBy);    // use comma as separator  
                        Inventory.weight.add(employee[0]);
                        Inventory.dmgDef.add(employee[1]);
                        Inventory.value.add(employee[2]);
                        Inventory.mod.add(employee[3]);
                        Inventory.tier.add(employee[4]);
                        Inventory.type.add(employee[5]);
                        Inventory.durabilty.add(employee[6]);
                        Inventory.maxDurabilty.add(employee[7]);
                    }
                    System.out.println();
                    br.close();
                    

                     
            
                   
                }catch (IOException e){
                    e.printStackTrace();  

                }
        }else{
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter("inventory.csv", true));
                bw.newLine();
                bw.write(Weight.toString() + "," + DamageDefense.toString() + "," + Value.toString() + "," + Mod.toString() + "," + Tier.toString() + "," + Type.toString() + "," + Durability.toString() + "," + MaxDurability.toString());
                bw.close();
               Inventory.weight.add(Weight.toString());
               Inventory.dmgDef.add(DamageDefense.toString());
               Inventory.value.add(Value.toString());
               Inventory.mod.add(Mod.toString());
               Inventory.tier.add(Tier.toString());
               Inventory.type.add(Type.toString());
               Inventory.durabilty.add(Durability.toString());
               Inventory.maxDurabilty.add(MaxDurability.toString());

            }
            catch (IOException e){
                e.printStackTrace();
            }


        }
            
        }  
        public static void display(Integer i){
           
            // String Output = currentMod + " " + currentTier + " " + currentType  + currentWeight + currentDmgDef + currentValue  + currentDurability + "/" + currentMaxDurability;
            // return Output;
            
        
            
        }

        // public static Integer i = 1;
        // public static String currentType;
        // public static String currentTier; 
        // public static String currentMod;
        // public static String currentWeight = Inventory.weight.get(i);
        // public static String currentDmgDef = Inventory.dmgDef.get(i);
        // public static String currentValue = Inventory.value.get(i);
        // public static String currentDurability = Inventory.durabilty.get(i);
        // public static String currentMaxDurability = Inventory.maxDurabilty.get(i);
    }












