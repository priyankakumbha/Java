import java.util.Arrays;
class F
{
  public static void main(String[] args)
  {
    int[] x = {10, 20, 30, 4, 50, 2 ,70};
    System.out.println(Arrays.toString(x));
    int min = x[0];
  for(int i = 1; i < x.length; i++)
  {
  if(x[i] < min)
  {
    min = x[i];
  }
  }
  System.out.println("min:" + min);

  }
}
