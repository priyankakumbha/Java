class A {
  A()//constructor should have a same class name
  //should not have a return type, method can have a return type
  //should not be  static, always nonstatic
  //can take any number of arguments
  //constructor will be executing while automatically whenever objet is creating
  //are used for intializing non static members
  {
    System.out.println("A()");
  }
  public static void main(String[] args)
  {
    A a1 = new A();
    System.out.println("-----");
    A a2 = new A();
  }
}
