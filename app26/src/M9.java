import java.sql.*;
class M9
{
  public static void main(String[] args)
  {
    String sql = "DELETE FROM TAB205 WHERE ID > 300";
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
