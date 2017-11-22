class Person
{
  String name;
  int age;
  double weight;
  Person(String name, int age, double weight)
  {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  public int hashCode()
  {
    int hash = name.hashCode();
    hash += Integer.toString(age).hashCode();
    hash += Double.toString(weight).hashCode();
    return hash;
  }
}
class M40
{
  public static void main(String[] args)
  {
    Person p1 = new Person("ramu", 22, 50.8);
    Person p2 = new Person(null, 22, 50.8);
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
  }

}
