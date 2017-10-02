import java.util.Arrays;
class K
{
  public static void main(String[] args)
  {
    int[] x = {10, 20, 30, 4, 50, 6 ,70};
    System.out.println(Arrays.toString(x));
    System.out.println("read even indexed in the reverse order");
  for(int i = (x.length - 1) % 2 == 0 ?
              x.length - 1 : x.length - 2;
              i >= 0 ; i -= 2)
  {
  System.out.print(x[i] + ",");
  }

  System.out.println();
  System.out.println("read odd indexed in the reverse order");
for(int i = (x.length - 1) % 2 != 0 ?
            x.length - 1 : x.length - 2;
            i >= 0 ; i -= 2)
{
System.out.print(x[i] + ",");
}
System.out.println();
  System.out.println(Arrays.toString(x));

  }
}
