import java.util.Arrays;
class H
{
  public static void main(String[] args)
  {
    int[] x = {10, 20, 30, 4, 50, 6 ,70};
    System.out.println(Arrays.toString(x));
    System.out.println("first element: " + x[0]);
    System.out.println("last element: " + x[x.length-1]);
    System.out.println("middle element : " + x[x.length / 2]);
    int min = x[0], max = x[0], sum = x[0];
  for(int i = 1; i < x.length; i++)
  {
  if(x[i] < min)
  {
    min = x[i];
  }
  if(x[i] > max)
  {
    max = x[i];
  }
  sum += x[i];
  }
  double avg = (double) sum / x.length;
  System.out.println("max:" + min);
  System.out.println("max:" + max);
  System.out.println("max:" + sum);
  System.out.println("max:" + avg);

  }
}
