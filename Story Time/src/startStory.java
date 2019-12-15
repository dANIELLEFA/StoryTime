
public class startStory
{
	static int list = 1;
	static int choose;
	public static void chooseStory()
	{
		System.out.println("Hello user. Here are the stories in store for you today:");
		loading();
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
	public static  void delay()
	{
		try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
				e.printStackTrace();
			}
		// delays
	}
	public static void loading()
	{
		// shows loading
		System.out.print("L");
		delay();
		System.out.print("O");
		delay();
		System.out.print("A");
		delay();
		System.out.print("D");
		delay();
		System.out.print("I");
		delay();
		System.out.print("N");
		delay();
		System.out.print("G");
		delay();
		System.out.println();
	}

}
