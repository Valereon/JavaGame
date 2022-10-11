package JavaGame.Classes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import JavaGame.Classes.HelperMethods;
import java.awt.event.KeyListener;
import java.io.Console;

import javax.swing.JPanel;


public class AsciiMap extends JPanel {
    private static String[][] Earth = {{"W", "W", "W"},
                              {"W", "W", "W"},
                              {"W", "W", "W"}};
    private static int x = 0;
    private static int y = 0;

    
    
    private static void dispMap(){
        Earth[y][x] = "@";
        for(int i = 0; i < Earth.length; i++){
            for(int j = 0; j < Earth[i].length; j++){
                System.out.print(Earth[i][j]);
            }
            System.out.println();
           
        }
        
    }
    private static void startKey(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            Earth[y][x] = "W";
            y--;
            dispMap();
        }
        else if(key == KeyEvent.VK_S){
            Earth[y][x] = "W";
            y++;
            dispMap();
        }
        else if(key == KeyEvent.VK_A){
            Earth[y][x] = "W";
            x--;
            dispMap();
        }
        else if(key == KeyEvent.VK_D){
            Earth[y][x] = "W";
            x++;
            dispMap();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        while(true){
            HelperMethods.cls();
            dispMap();
        }
        
    }

}