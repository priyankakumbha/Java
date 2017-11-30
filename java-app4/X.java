class W
{
	W()
	{
		System.out.println("W()");
	}


	{
		System.out.println("W-IIB");
	}

	W(int i)
	{
		this();
		System.out.println("W(int)");
	}
}
class X extends W
{
	X()
	{
		this(10);
		System.out.println("X()");
	}

	X(int i)
	{
		System.out.println("X(int)");
	}

	X(int i, int j)
	{
		super(i);
		System.out.println("X(int, int)");
	}

	{
		System.out.println("X-IIB");
	}

	public static void main(String[] args)
	{
		X x1 = new X();
		System.out.println("---------");
		X x2 = new X(10);
		System.out.println("---------");
		X x3 = new X(10, 20);
		System.out.println("---------");
	}
}
