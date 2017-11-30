import java.sql.*;
class M10
{
  public static void main(String[] args)
  {
    String sql1 = "INSERT INTO TAB205 VALUES(501, 'ABC', 22)";
    String sql2 = "INSERT INTO TAB205 VALUES(502, 'XYZ', 23)";
    String sql3 = "INSERT INTO TAB205 VALUES(503, 'TEST, 32)";
    Connection con = null;
    Statement stmt = null;
    try
    {
      con = Util.getConnection();
        stmt = con.createStatement();
        con.setAutoCommit(false);
        stmt.executeUpdate(sql1);
        stmt.executeUpdate(sql2);
        stmt.executeUpdate(sql3);
        con.commit();
        System.out.println("done");
      }
        catch(SQLException ex)
        {
          System.out.println("some exception occured");
          try
          {
            if(con != null)
            {
              con.rollback();
            }
          }
          catch (SQLException ex1)
          {

          }

        }
        System.out.println("done");
  }
}
