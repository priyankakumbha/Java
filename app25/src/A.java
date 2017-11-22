class A
{
  int i, j, k;
  A(int i, int j, int k)
  {
    this.i = i;
    this.j = j;
    this.k = k;
  }
  public String toString()
  {
    return "(" + i + "," + j + "," + k + ")";
  }
  public int hashCode()
  {
    int hash = Integer.toString(i).hashCode();
    hash += Integer.toString(j).hashCode();
    hash += Integer.toString(k).hashCode();
    System.out.println("hashCode of " + this + ":" + hash );
    return hash;
  }
  public boolean equals(Object obj)
  {
  boolean flag = (obj instanceof A) &&
                  ( i == ((A)obj).i) &&
                  ( j == ((A)obj).j) &&
                  ( k == ((A)obj).k);
System.out.println("equlas b/w " + this + " and " + ":" + flag );
                  return flag;

  }
}
