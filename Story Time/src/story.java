
public abstract class story
	{
		protected String name;
		public abstract void makeNoise();
		public   void delay()
			{
				try
					{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						
						e.printStackTrace();
					}
				// delays
			}
		public  void loading()
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
