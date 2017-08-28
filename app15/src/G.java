class G
{
  public static void main(String[] args)
  {
    int i = 10;
    Integer obj = Integer.valueOf(i);
    int j = obj.intValue();
    System.out.println(i == j);
  }
}
