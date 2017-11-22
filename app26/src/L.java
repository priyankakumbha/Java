import java.sql.*;

class L
{
  public static void main(String[] args) throws Exception
  {
    String driverClass = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=XEXDB)))";
    String user = "priya";
    String password = "test123";
    //1. registering driver
    try
    {
      Class.forName(driverClass);
    }
    catch (ClassNotFoundException ex)
    {
      ex.printStackTrace();
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM TAB205";
    try
    {
      //2. establishing a db Connection
      con = DriverManager.getConnection(url, user, password);
      //3. creating stmt to send sql command
      stmt = con.createStatement();
      //4. sending sql command to the db
      rs = stmt.executeQuery(sql);
      //5. processing db results
      while(rs.next())
      {
        System.out.print(rs.getString(1) + "\t");
        System.out.print(rs.getString(2) + "\t");
        System.out.print(rs.getString(3) + "\t");
        System.out.println();
      }
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
    }
    finally
    {
      //5. closing all db resources
      try
      {
        if(rs != null)
        {
          rs.close();
        }
      }
      catch (SQLException ex)
      {
        ex.printStackTrace();
      }
      try
      {
        if(stmt != null)
        {
          stmt.close();
        }
      }
      catch (SQLException ex)
      {
        ex.printStackTrace();
      }
      try
      {
        if(con != null)
        {
          con.close();
        }
      }
      catch (SQLException ex)
      {
        ex.printStackTrace();
      }
    }
    System.out.println("done");
  }
}
