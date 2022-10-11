package JavaGame;

import JavaGame.Classes.*;

public class MainLoop {
    public static Menus MainMenu = new Menus(new String[]{"New Game", "Load Game", "Options", "Exit"}, "Main Menu");
    public static Menus OptionsMenu = new Menus(new String[]{"Graphics", "Sound", "Controls", "Back"}, "Options Menu");
    public static String currentMenu;
    public static void main(String[] args) {
        MainMenu.displayMenu();
        currentMenu = "MainMenu";

        while(true){
            int menuChoice = input();
            displayGame(menuChoice);
            updateGame();
            
        }
    }
    
    public static int input(){
        //input logic
        return MainMenu.menuInput();
        
        

    }

    public static void displayGame(int menuChoice){
        //display game logic
        if(currentMenu.equals("MainMenu")){
            dispMainMenu(menuChoice);

        }
       


    }

   
    public static void updateGame(){
        //update game logic
        

        

    }

    public static void dispMainMenu(int menuChoice){
        if(menuChoice == 1){
            
        }
        else if(menuChoice == 2){
            
        }
        else if(menuChoice == 3){

        }
        else if(menuChoice == 4){
            
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }

}