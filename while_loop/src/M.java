class M
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			int j = 10;
			do
			{
				System.out.println(i + "," + j);
				j++;
			}while(j <= 12);
		}
		System.out.println("main end");
	}
}
