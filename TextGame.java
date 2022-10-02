package JavaGame;
import java.util.Scanner;





public class TextGame {

    public static void main(String[] args) {
		Inventory.main(args);
		TextGame.preShack(args);

    }



	public static void preShack(String[] args){
		Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Start Game");
        keyboard.nextInt();
        System.out.println("You Wake up In a Forest, nothing but trees for as far as the eye can see.");
        System.out.println("You try to move but there is a sharp pain in your side");
        System.out.println("But despite all this you notice a shack in the distance");
		System.out.println("1. Move toward the Shack and ignore the pain");
		System.out.println("2. Investigate the pain in your side");
		int choice = keyboard.nextInt();
		if(choice == 1){
			System.out.println("You move toward the shack when suddenly you hear something Whiz passed your head you look over to your left and see an arrow lodged into the ground");
			System.out.println("1. Try to get up and run to the Shack");
			System.out.println("2. Accept your fate");
			choice = keyboard.nextInt();
			if(choice == 1){
				System.out.println("You start to run towards the shack you stumble a few times and then when you finally make it to the shack you yank the door open with all your might and the door opens");
				TextGame.shack(args);
			}else{
				System.out.println("as you lay there to accept your fate you slowly die of blood loss from the arrow in you leg");
			}
		}else{
			System.out.println("As you look at your side you see a arrow sticking out of you ribcage and then just as you look back up at the cabin another arrow hits you in the leg");
			System.out.println("1. Start crawling towards the shack");
			System.out.println("2. Try to pull out the arrow");
			choice = keyboard.nextInt();
			if(choice == 1){
				System.out.println("while crawling to the shack a few more arrows almost hit you all quite close calls but after what seems like an eternity you make it to the shack and open the door");
			}else{
				System.out.println("While pulling out the arrow another one struck you in the chest killing you YOU DIED");
			}

		
		}
		keyboard.close();
		
	}

	public static void shack(String[] args){		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to your shack");
		System.out.println("1. Go Exploring");
		System.out.println("2. Use your Forge to forge new equipment");
		// System.out.println("3. Use your anvil to upgrade/repair/reforge equipment");
		System.out.println("3. Use your chest to store equipment");
		System.out.println("4. Buy/Sell Equipment at the traders");
		System.out.println("5. View your stats/Inventory");
		int choice = keyboard.nextInt();
		if(choice == 1){
			
		}else if(choice == 2){
			Forge.main(args);
		}else if(choice == 3){
			Chest.main(args);
		//else if(choice == 3){
		// 	Anvil.main(args);
		}else if(choice == 4){

		}else{

		}
		keyboard.close();



	}
}	
