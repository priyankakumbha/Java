import java.util.Arrays;
class W
{
	public static void main(String[] args)
	{
		int[] x = {10, 20, 3, 4};
		int[] y = {20, 4, 40, 5, 50, 8, 10};
    System.out.println(Arrays.toString(x));
    System.out.println(Arrays.toString(y));
    System.out.println("--------------------");
		int[] z = new int[x.length + y.length];

		for(int i = 0; i < y.length; i++)
		{
      z[i] = y[i];
    }
			for(int j = 0; j < x.length; j++)
			{
				z[y.length + i] = x[i];
			}
System.out.println(Arrays.toString(z));
	}
}
