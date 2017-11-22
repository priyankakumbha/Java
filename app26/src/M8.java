import java.sql.*;
class M8
{
  public static void main(String[] args)
  {
    String sql = "UPDATE TAB205 SET NAME = 'XYZ' WHERE ID > 500";
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
