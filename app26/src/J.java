import java.sql.*;

class J
{
  public static void main(String[] args) throws Exception
  {
    String driverClass = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=XEXDB)))";
    String user = "priya";
    String password = "test123";
    Class.forName(driverClass);
    Connection con =
    //DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "test123");
    DriverManager.getConnection(url, user, password);
    Statement stmt = con.createStatement();

    String sql = "SELECT * FROM TAB205";
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next())
    {
      System.out.println(rs.getString(1) + "\t");
      System.out.println(rs.getString(2) + "\t");
      System.out.println(rs.getString(3) + "\t");
      System.out.println();
    }
    System.out.println("done");
  }
}
