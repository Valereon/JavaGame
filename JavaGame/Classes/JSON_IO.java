package JavaGame.Classes;

import com.google.gson.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;


public class JSON_IO {

    public static void main(String[] args){
        
        Gson gson = new Gson();

        
        try (Reader reader = new FileReader("H:\\Github\\GitHub\\Learning java game\\JavaGame\\JavaGame\\Json\\test.json")){



            CraftingRecipes test = gson.fromJson(reader, CraftingRecipes.class);
            System.out.println(test.Name);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}   

    