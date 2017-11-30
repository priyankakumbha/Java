import java.sql.*;

class N
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
String sql = "INSERT INTO TAB205 VALUES(401, 'TEST', 22)";
//2. establishing a db connection
//3. creating stmt to send sql command

try(Connection con = DriverManager.getConnection(url, user, password);
    Statement stmt = con.createStatement())
    {
      //4. sending sql command to the db
      stmt.execute(sql);
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
    }
    System.out.println("done");
  }
}
