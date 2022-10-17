package JavaGame.Classes.Crafting;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

class JsonIO {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new FileReader("JavaGame/Json/test.json")){
            Gson gson = new Gson();

            CraftingRecipes[] recipes = gson.fromJson(reader, CraftingRecipes[].class);
            for (CraftingRecipes recipe : recipes) {
                System.out.println(recipe);
            }

            
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
        
        
    }
    
