
public class ThreeBrothersOlder
{
	
public static void firstChoice()
{
	System.out.println(StoryTime.players[0].firstLine);
	System.out.println("My younger brothers are so slow. I mean how am I going to live my life when I am always so slow. "+
	"1. Do you hurry off towards the bridge or 2. do you wait for your annoying brothers?");
	 startStory.choose = StoryTime.intInput.nextInt() ;
	 if(startStory.choose == 1)
	 {
		 System.out.println("Thank goodness, now we are moving a lot faster as they are changing after me.");
	 }
	 else
	 {
		 System.out.println("Fine, I will be nice for once.");
	 }
	 bridge();
}
public static void bridge()
{
	System.out.println("The brothers reached the bridge. The brothers snuck past Death on to the bridge. Death congraulated the boys."
			+ " He gave them each something magical of their choice. ");
	secoundChoice();
	
}
public static void secoundChoice()
{
	 StoryTime.players[ChooseCharacter.character].lives--;
	 ChooseCharacter.lives();
	System.out.println("I chose the Elder wand, even if a brush with Death made me weaker. It is the most magical wand. I decided to leave my brothers and go to a near by inn. "
			+ " 1. Should I drink or 2.should go to sleep?");
	 startStory.choose = StoryTime.intInput.nextInt() ;
	 if(startStory.choose == 1)
	 {
		 StoryTime.players[ChooseCharacter.character].lives--;
		 ChooseCharacter.lives();
		ThirdChoice();
	 }
	 else
	 {
		 System.out.println("I am going to bed.");
		 System.out.println("Sorry, but your enemy, Lucifier, came and slit your throat.");
		 StoryTime.players[ChooseCharacter.character].lives = 0;
		 ChooseCharacter.lives();
	 }
}
public static void ThirdChoice()
{
	System.out.println("I decided to boast about a recent conquest. ");
	StoryTime.players[ChooseCharacter.character].gloat();
	System.out.println(" 1. Should I attempt to dual or 2.should go to sleep?");
	 startStory.choose = StoryTime.intInput.nextInt() ;
	 if(startStory.choose == 1)
	 {
		fightScene();
		
	 }
	 else
	 {
		 System.out.println("I am going to bed.");
		 System.out.println("Sorry, but someone decided that they are better fit for the elder wand. They came and slit your throat.");
		 StoryTime.players[ChooseCharacter.character].lives = 0;
		 ChooseCharacter.lives();
	 }
}
public static void fightScene()
{
	startStory.list =1;
	boolean stillFighting;
	int fight = 0;
	int dying = 5;
	while(stillFighting = true)
	{
		startStory.list =1;
		int opponent = (int)(Math.random()*StoryTime.spell.length);
		System.out.println("Choose a spell:");
		for(int i = 0; i < StoryTime.spell.length; i++)
		{
			
				System.out.println( startStory.list + ". " + StoryTime.spell[i].name);
				startStory.list++;
			
			
		}
		
		 startStory.choose = StoryTime.intInput.nextInt() -1 ;
		 StoryTime.spell[startStory.choose ].makeNoise();
		 StoryTime.spell[startStory.choose ].createSparks();
		 System.out.println("I chose " + StoryTime.spell[startStory.choose ].name + ". My opponent used " + StoryTime.spell[opponent ].name +".");
		 if(startStory.choose < opponent )
		 {
			 System.out.println("I hit him.");
			 StoryTime.players[ChooseCharacter.character].gloat();
		 }
		 else if(startStory.choose == opponent )	
		 {
			 System.out.println("It is a tie this time.");
		 }
		 else
		 {
			 StoryTime.players[ChooseCharacter.character].crying();
			 dying--;
			 
		 }
		 fight++;
		 if(dying ==0 ||  opponent ==0 )
		 {
			 System.out.println("Your died");
			 StoryTime.players[ChooseCharacter.character].lives = 0;
			 stillFighting = false;
			 ChooseCharacter.lives();
		 }
		
	}
}
}
