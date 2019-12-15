
public class books extends story
{
protected String setting;
public void closeBook()
{
	System.out.println("Closing Book");;
}
public void openBook()
{
	System.out.println("Opening Book");
}
	@Override
	public void makeNoise()
	{
		System.out.println("This book is named " + name + ".");
		
	}

}
