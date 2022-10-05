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
                    BufferedReader br = new BufferedReader(new FileReader("CSV files/inventory.csv"));  
                    
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
                BufferedWriter bw = new BufferedWriter(new FileWriter("CSV files/inventory.csv", true));
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
        public static void chestParseIn(String[] args){
            String line = "";  
            String splitBy = ",";
            try{ 
                BufferedReader br = new BufferedReader(new FileReader("CSV files/chest.csv"));  
                
                while ((line = br.readLine()) != null){  
                    String[] employee = line.split(splitBy);    // use comma as separator  
                    Inventory.chestWeight.add(employee[0]);
                    Inventory.chestDmgDef.add(employee[1]);
                    Inventory.chestValue.add(employee[2]);
                    Inventory.chestMod.add(employee[3]);
                    Inventory.chestTier.add(employee[4]);
                    Inventory.chestType.add(employee[5]);
                    Inventory.chestDurabilty.add(employee[6]);
                    Inventory.chestMaxDurabilty.add(employee[7]);
                }
                System.out.println();
                br.close();
                

                    
        
                
            }catch (IOException e){
                e.printStackTrace();  

            }
            
            
        
            
        

    }
    public static void chestWrite(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("CSV files/chest.csv", true));
            for(int i = 1; i < Inventory.tempChestWeight.size(); i++){
                bw.newLine();
                bw.write(Inventory.tempChestWeight.get(i) + "," + Inventory.tempChestDmgDef.get(i) + "," + Inventory.tempChestValue.get(i)  + "," + Inventory.chestMod.get(i)  + "," + Inventory.tempChestTier.get(i)  + "," + Inventory.tempChestType.get(i)  + "," + Inventory.tempChestDurabilty.get(i)  + "," + Inventory.tempChestMaxDurabilty.get(i));
            
            }
            bw.close();

        }
        catch (IOException e){
            e.printStackTrace();
        
    }
    }
}












