import java.sql.*;
class C
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
    String sql1 = "CREATE TABLE TAB205(ID NUMBER, NAME VARCHAR2(90), AGE NUMBER)";
    String sql2 = "INSERT INTO TAB205 VALUES(1, 'ROMA', 33)";
    String sql3 = "INSERT INTO TAB205 VALUES(2, 'RAVI', 35)";
    String sql4 = "INSERT INTO TAB205 VALUES(3, 'BABU', 37)";
    String sql5 = "INSERT INTO TAB205 VALUES(4, 'ANU', 31)";
    stmt.execute(sql1);
    stmt.execute(sql2);
    stmt.execute(sql3);
    stmt.execute(sql4);
    stmt.execute(sql5);
    System.out.println("DONE");
  }
}
