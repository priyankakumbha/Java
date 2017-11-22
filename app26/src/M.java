import java.sql.*;

class M
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
String sql = "SELECT * FROM TAB205";
//2. establishing a db connection
//3. creating stmt to send sql command
//4. sending sql command to the db
try(Connection con = DriverManager.getConnection(url, user, password);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql))
    {
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
    System.out.println("done");
  }
}
