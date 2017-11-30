import java.sql.*;
class M3
{
  public static void main(String[] args)
  {
    String sql = "SELECT * FROM TAB205";
    try(Connection con = Util.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql))
        {
          ResultSetMetaData rsmd = rs.getMetaData();
          int cols = rsmd.getColumnCount();
          System.out.println("cols:" + cols);
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
        }
    System.out.println("done");
  }
}
