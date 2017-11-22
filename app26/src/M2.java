import java.sql.*;
class M2
{
  public static void main(String[] args)
  {
    String sql = "SELECT * FROM TAB205";
    try(Connection con = Util.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql))
        {
          while(rs.next())
          {
            System.out.print(rs.getString(1) + "\t");
            System.out.print(rs.getString(2) + "\t");
            System.out.print(rs.getString(3) + "\t");
            System.out.println();
          }
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
        }
    System.out.println("done");
  }
}
