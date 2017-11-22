import java.sql.*;
class M4
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
          for(int i = 1; i <= cols; i++)
          {
            System.out.println(rsmd.getColumnName(i));
          }
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
        }
    System.out.println("done");
  }
}
