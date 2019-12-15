import java.util.ArrayList;
import java.util.Scanner;

public class StoryTime
{
	static Scanner stringInput = new Scanner (System.in);
	static Scanner intInput = new Scanner (System.in);
	static Scanner doubleInput = new Scanner (System.in);
	static	Characters[] players = new Characters[4];
	static	books [] stories = new books[3];
	static	potions [] cabinet = new potions[5];
	static	spells [] spell = new spells[6];
	static	handheldStuff [] backpack = new handheldStuff[3];
	static	furniture[] furniture = new furniture[20];
	static	ArrayList<Characters> library = new ArrayList <Characters>();
	public static void main(String[] args)
	{
		namingEverything.newStory();
		namingEverything.newFurniture();
		namingEverything.spells();
		startStory.chooseStory();

	}

}
