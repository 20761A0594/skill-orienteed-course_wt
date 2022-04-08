import java.sql.*;
import java.util.*;
class Prepare
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC94","IPC94");
System.out.println("Established");
Statement sct=con.createStatement();
PreparedStatement ps=con.prepareStatement("delete from employee where emp_id=?");
ps.setInt(1,188);
ps.executeUpdate();
}
catch(Exception e)
{
System.out.println(e);
}
}
}