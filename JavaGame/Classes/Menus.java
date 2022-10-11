package JavaGame.Classes;

import java.util.Scanner;

public class Menus {


    private String[] menuItems;
    private String menuTitle;

    public Menus(String[] menuitems, String menutitle){
        this.menuItems = menuitems;
        this.menuTitle = menutitle;
    }

    public void displayMenu(){
        System.out.println(menuTitle);
        for(int i = 1; i < menuItems.length; i++){
            System.out.println(i + " " + menuItems[i]);
        }
    }

    public int menuInput(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();     
        

    }
   


}
