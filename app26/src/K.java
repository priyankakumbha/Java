import java.sql.*;

class K
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
    String sql = "INSERT INTO TAB205 VALUES(101, 'ABC', 22)";
    try
    {
      //2. establishing a db Connection
      con = DriverManager.getConnection(url, user, password);
      //3. creating stmt to send sql command
      stmt = con.createStatement();
      //4. sending sql command to the db
      stmt.execute(sql);
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
