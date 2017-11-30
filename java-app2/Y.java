class Y
{
  static int i;
  Y()
  {
    i ++;
  }

  public static void main (String[] args)
  {
    Y y1 = new Y();
    Y y2 = new Y();
    Y y3 = new Y();
    Y y4 = new Y();
    System.out.println(Y.i);

  }
}
