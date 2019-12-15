import java.util.ArrayList;

public class namingEverything
	{
		
		
		
		public static void newStory()
		{
			StoryTime.stories[0] = new books();
			StoryTime.stories[0].name = "The Three Brothers";
			StoryTime.stories[1] = new books();
			StoryTime.stories[1].name = "Rapunzel";
			StoryTime.stories[2] = new books();
			StoryTime.stories[2].name = "Sleeping Beauty";
		}
		public static void newFurniture()
		{

			StoryTime.furniture[0] = new furniture();
			StoryTime.furniture[0].name = "bed";
			StoryTime.furniture[1] = new furniture();
			StoryTime.furniture[1].name = "chair";
			StoryTime.furniture[2] = new furniture();
			StoryTime.furniture[2].name = "table";
			StoryTime.furniture[3] = new furniture();
			StoryTime.furniture[3].name = "stoll";
			StoryTime.furniture[4] = new furniture();
			StoryTime.furniture[4].name = "sink";
			StoryTime.furniture[5] = new furniture();
			StoryTime.furniture[5].name = "tub";
		}
		public static void newMagic()
		{
			StoryTime.backpack[0] = new handheldStuff();
			StoryTime.backpack[0].name = "wand";
			StoryTime.backpack[1] = new handheldStuff();
			StoryTime.backpack[1].name = "Cloak of Invisibility";
			StoryTime.backpack[2] = new handheldStuff();
			StoryTime.backpack[2].name = "resurrection stone";
		}
		public static void spells()
		{
			StoryTime.spell[0] = new spells();
			StoryTime.spell[0].name = "Sectumsempra";
			StoryTime.spell[1] = new spells();
			StoryTime.spell[1].name = "Incendio";
			StoryTime. spell [2] = new spells();
			StoryTime.spell[2].name = "Crucio";
			StoryTime.spell[3] = new spells();
			StoryTime.spell[3].name = "Stupefy";
			StoryTime.spell[4] = new spells();
			StoryTime.spell[4].name = "Expelliarmus";
			StoryTime.spell[5] = new spells();
			StoryTime.spell[5].name = "Permanent Sticking Charm";
		}
		
	}
