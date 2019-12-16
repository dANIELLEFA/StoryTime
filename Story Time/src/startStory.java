
public class startStory
{
	static int list = 1;
	static int choose;
	public static void chooseStory()
	{
		System.out.println("Hello user. Here are the stories in store for you today:");
		StoryTime.stories[0].loading();
		for(int i = 0; i< StoryTime.stories.length;i++)
		{
			System.out.println(list +"." +StoryTime.stories[i].name);
			list++;
			// prints list of stories
		}
		System.out.println("Which one do you want today?");
		 choose = StoryTime.intInput.nextInt() -1;
		if(choose == 0)
		{
			
			ChooseCharacter.storyOne();
		}
		else if(choose == 1)
		{
			ChooseCharacter.storyTwo();
		}
		else if(choose == 2)
		{
			ChooseCharacter.storyThree();
		}
		else
		{
			chooseStory();
		}
	}
	

}
