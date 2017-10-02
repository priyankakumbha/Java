import java.sql.*;
class M
{
  public static void main(String[] args)

  {
    System.out.println(1);
    try
    {
      DriverManager.getConnection("");
    }
    catch (SQLException ex)
    {
      System.out.println("catch");
    }
    System.out.println(2);
  }
}
