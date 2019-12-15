
public  class Characters extends story
	{

	protected String firstLine;
	
	protected int lives = 3;
	protected String build;
	protected String hairColor;
	public void gloat()
	{
		System.out.println("I am doing great.");
	}
	public void crying()
	{
		System.out.println("My life is horrible.");
	}
@Override
	public void makeNoise()
	{
		System.out.println("Ow!");
	}
		
	}
