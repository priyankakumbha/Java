import java.sql.*;
class M7
{
  public static void main(String[] args)
  {
    String sql = "INSERT INTO TAB205 VALUES(601, 'ABC', 22)";
    try(Connection con = Util.getConnection();
        Statement stmt = con.createStatement())
        {
          int results = stmt.executeUpdate(sql);
          System.out.println(results);
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
        }
        System.out.println("done");
  }
}
