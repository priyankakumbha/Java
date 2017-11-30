class I
{
	public static void main(String[] args)
	{
		int x = 0;
		int y = x++   +   x++  +   x++  +  x;
		//int y = 0 + 1 + 2 + 3
		System.out.println(x);//3
		System.out.println(y);//6
  }
}
