import java.util.ArrayList;
import java.util.Scanner;

public class StoryTime
{
	static Scanner stringInput = new Scanner (System.in);
	static Scanner intInput = new Scanner (System.in);
	static Scanner doubleInput = new Scanner (System.in);
	static	Characters[] players = new Characters[4];
	static	story [] stories = new story[3];
	static	potions [] cabinet = new potions[5];
	static	furniture[] furniture = new furniture[20];
	static	ArrayList<Characters> library = new ArrayList <Characters>();
	public static void main(String[] args)
	{
		namingEverything.newStory();
		namingEverything.newFurniture();
		startStory.chooseStory();

	}

}
