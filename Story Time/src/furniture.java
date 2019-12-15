
public class furniture extends story
	{
		protected String position;
		protected String sitOrLay;
		public void moveBackward()
		{
			System.out.println("This chair is moving backward.");
		}
		public void moveForward()
		{
			System.out.println("This chair is moving forward.");
		}
		@Override
		public void makeNoise()
			{
				System.out.println("Creak");
			}
	}
