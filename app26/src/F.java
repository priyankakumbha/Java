import java.sql.*;
import java.io.*;
class F
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
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader(fin);
    String line = bin.readLine();
    String id, name, age, sql, data[];
    while(line != null)
    {
      data = line.split(";");
      id = data[0].trim();
      name = data[1].trim();
      age = data[2].trim();

     sql = "INSERT INTO TAB205 VALUES(" + id + ", '" + name + "', " + age + ")";
    stmt.execute(sql);
    line = bin.readLine();
  }
    System.out.println("done");
  }
}
