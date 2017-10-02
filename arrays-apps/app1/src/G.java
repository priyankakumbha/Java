import java.util.Arrays;
class G
{
  public static void main(String[] args)
  {
    int[] x = {10, 20, 30, 4, 50, 2 ,70};
    System.out.println(Arrays.toString(x));
    int max = x[0];
  for(int i = 1; i < x.length; i++)
  {
  if(x[i] > max)
  {
    max = x[i];
  }
  }
  System.out.println("max:" + max);

  }
}
