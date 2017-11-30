public class  BubbleSort
{
  public static void main(String[] args)
  {
    int[] elements = {10, 5,12, 7, 1, 20, 18, 0, 3, 15};
    System.out.println(Arrays.toString(elements));
    int size = elements.length;
    for(int i=0; i< elements.length; i++)
    {
      for(int j= 0; j<(size-1); j++)
      {
        if(elements[j] > elements[j+1])
        {
          int temp = elements[j];
          elements[j] = elements[j+1];
          elements[j+1]; = temp;
        }
      }
      size --;
    }
  }
}
