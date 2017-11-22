import java.sql.*;
class D
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
    if(args.length < 3)
    {
      System.out.println("PLS SUPPLY 3 COMMAND LINE ARGUMENTS");
      return;
    }
    String id = args[0];
    String name = args[1];
    String age = args[2];

    String sql = "INSERT INTO TAB205 VALUES(" + id + ", '" + name + "', " + age + ")";
    stmt.execute(sql);
    System.out.println("DONE");
  }
}
