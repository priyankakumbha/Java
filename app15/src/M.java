class M
{
  public static void main(String[] args)
  {
    char c1 = 'a';
    Character c2 = new Character(c1);
    Character c3 = Character.valueOf(c1);
    char c4 = c2.charValue();
    char c5 = c3.charValue();
    System.out.println("done");
  }
}
