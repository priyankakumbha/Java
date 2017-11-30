import java.sql.*;

class H
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
      System.out.println(rs.getInt("id") + "\t");
      System.out.println(rs.getString("name") + "\t");
      System.out.println(rs.getInt("age") + "\t");
      System.out.println();
    }
    System.out.println("done");
  }
}
