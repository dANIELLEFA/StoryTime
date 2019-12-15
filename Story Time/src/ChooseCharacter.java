
public class ChooseCharacter
{
	static int character;
public static void storyOne()
{
	startStory.list =1;
	System.out.println("You chose " + StoryTime.stories[startStory.choose].name + ". Let's get started! ");

	StoryTime.players[0] = new Characters();
	StoryTime.players[0].name = "the eldest brother";
	StoryTime.players[0].firstLine= "You guys are so slow";
	StoryTime.players[0].build ="cocky";
	StoryTime.players[0].hairColor = "brown";
	StoryTime.players[1] = new Characters();
	StoryTime.players[1].name = "the secound brother";
	StoryTime.players[1].firstLine = "Life sucks";
	StoryTime.players[1].build = "sad";
	StoryTime.players[1].hairColor ="black";
	StoryTime.players[2] = new Characters();
	StoryTime.players[2].name = "the youngest brother";
	StoryTime.players[2].firstLine = "We should analize the situation";
	StoryTime.players[2].build = "smart";
	StoryTime.players[2].hairColor = "brown";
	StoryTime.players[3] = new Characters();
	StoryTime.players[3].name = "Death";
	StoryTime.players[3].firstLine = "No one gets past me";
	StoryTime.players[3].build ="gloomy";
	StoryTime.players[3].hairColor ="black";
	
	System.out.println( "Here is a list of characters you can play:");
	for(int i = 0; i < StoryTime.players.length; i++)
	{
		
			System.out.println( startStory.list + ". " + StoryTime.players[i].name);
			
			startStory.list++;
		
	}
	chooseCharacters();
}
public static void storyTwo()
{
	System.out.println("You chose " + StoryTime.stories[startStory.choose].name + ". Let's get started!");
}
public static void storyThree()
{
	System.out.println("You chose " + StoryTime.stories[startStory.choose].name + ". Let's get started!");
}
public static void chooseCharacters()
{
	
	System.out.println("Choose one of the characters");
	 character = StoryTime.intInput.nextInt() -1;
	 if(character ==0) 
	 {
		 System.out.println("You chose " + StoryTime.players[0].name + " He is described as " +
	 StoryTime.players[0].build + ". He has " + StoryTime.players[0].hairColor + " colored hair. Good luck.");
		 lives();
	 }
	 if(character ==1) 
	 {
		 System.out.println("You chose " + StoryTime.players[1].name + " He is described as " +
				 StoryTime.players[1].build + ". He has " + StoryTime.players[1].hairColor + " colored hair. Good luck.");
					 lives();
	 }
	 if(character ==2) 
	 {
		 System.out.println("You chose " + StoryTime.players[2].name + " He is described as " +
				 StoryTime.players[2].build + ". He has " + StoryTime.players[2].hairColor + " colored hair. Good luck.");
					 lives(); 
	 }
	 if(character ==3) 
	 {
		 System.out.println("You chose " + StoryTime.players[3].name + " He is described as " +
				 StoryTime.players[3].build + ". He has " + StoryTime.players[3].hairColor + " colored hair. Good luck.");
					 lives();
	 }	
}
public static void lives()
{
	System.out.println("You have " + StoryTime.players[character].lives + " lives left.");
}
}
