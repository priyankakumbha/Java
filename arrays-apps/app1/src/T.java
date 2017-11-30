import java.util.Arrays;
class T
{
  public static void main(String[] args)
  {
    int[] x = {10, 12, 30, 4, 60, 7 , 80};
    int[] y = {10, 30, 7, 90};
    System.out.println(Arrays.toString(x));
    System.out.println(Arrays.toString(y));
    int size = x.length;
    boolean flag = false;
    for(int i= 0; i< size; i++)
    {
      //System.out.println("value of i" + i);
      for(int j = 0; j < y.length; j++)
      {
        //System.out.println("value of j "+ j);
        if(x[j] == y[i])
        {
          flag = false;
          break;
        }
      }
      if(flag)
      {
      for(int k = i; k< size-1; k++)
      {
        x[k] = x[k+1];
      }
      i--;
      size --;
      }
      flag = true;
    }
    int[] z = new int[size];
    for(int i = 0; i < size; i++)
    {
      z[i] = x[i];
    }
    System.out.println(Arrays.toString(x));
    System.out.println(Arrays.toString(y));
    System.out.println(Arrays.toString(z));
  }
}
