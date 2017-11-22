import java.sql.*;
import java.io.*;
import java.util.*;

class Util
{
private static final String DRIVER_CLASS;
private static final String URL;
private static final String USERNAME;
private static final String PASSWORD;

static
{
Properties pr = new Properties();
try(FileReader fin = new FileReader("db.properties"))
{
  pr.load(fin);
}
catch(IOException ex)
{
ex.printStackTrace();
}
DRIVER_CLASS = pr.getProperty("driverClass");
URL = pr.getProperty("url");
USERNAME = pr.getProperty("user");
PASSWORD = pr.getProperty("password");
}

static
{
  try
  {
    Class.forName(DRIVER_CLASS);
  }
  catch (ClassNotFoundException ex)
  {
    ex.printStackTrace();
  }
}
public static Connection getConnection()
throws SQLException
{
  Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
  return con;
}
}
