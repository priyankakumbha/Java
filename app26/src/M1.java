import java.sql.*;
class M1
{
  public static void main(String[] args)
  {
    String sql = "INSERT INTO TAB205 VALUES(501, 'ABC', 22)";
    try(Connection con = Util.getConnection();
        Statement stmt = con.createStatement())
        {
          stmt.execute(sql);
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
        }
    System.out.println("done");
  }
}
