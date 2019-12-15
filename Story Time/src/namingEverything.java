import java.util.ArrayList;

public class namingEverything
	{
		static	story[] players = new story[1];
		static	ArrayList<spells> powers = new ArrayList <spells>();
		static	ArrayList<potions> cabniet = new ArrayList <potions>();
		static	ArrayList<furniture> furniture = new ArrayList <furniture>();
		
		public static void newCharacters()
		{
			 players[0] = new Characters();
			 players[0].makeNoise();
		}
		
		
	}
