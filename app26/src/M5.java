import java.sql.*;
class M5
{
  public static void main(String[] args)
  {
    String sql = "SELECT * FROM TAB205";
    try(Connection con = Util.getConnection())
    {
      DatabaseMetaData dbmd = con.getMetaData();
      System.out.println(dbmd.getDriverName());
      System.out.println(dbmd.getDatabaseProductName());
    }
     catch(SQLException ex)
        {
          ex.printStackTrace();
        }
    System.out.println("done");
  }
}
