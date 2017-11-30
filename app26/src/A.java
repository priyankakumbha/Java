import java.sql.*;
class A
{
  public static void main(String[] args) throws Exception
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con =
    //DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "test123");
    DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=XEXDB)))","priya","test123");
    Statement stmt = con.createStatement();
    String sql = "CREATE TABLE TAB204(SNO NUMBER)";
    stmt.execute(sql);
    System.out.println("Hello World!");
  }
}
