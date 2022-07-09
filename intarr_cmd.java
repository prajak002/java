class demo14
{
	public static void main(String[] args)
	{
		int ia[]=new int [args.length];
		for(int i=0; i<args.length; i++)
		{
			try
			{
				ia[i]=Integer.parseInt(args[i]);
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
		}
		for (int i=0; i<ia.length; i++)
		{
			System.out.print(ia[i]+" ");
			
		}
		
	}
	
}