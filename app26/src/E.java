import java.sql.*;
import java.util.*;
class E
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
    Scanner sc = new Scanner(System.in);
    System.out.println("PLS enter id");
    String id = sc.next();
    System.out.println("PLS enter name");
    String name = sc.next();
    System.out.println("PLS enter age");
    String age = sc.next();

    String sql = "INSERT INTO TAB205 VALUES(" + id + ", '" + name + "', " + age + ")";
    stmt.execute(sql);
    System.out.println("DONE");
  }
}
