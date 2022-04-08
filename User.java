import java.sql.*;
import java.util.*;
class User
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC94","IPC94");
System.out.println("Established");
//read input from the user
Scanner s =new Scanner(System.in);
System.out.println("enter your employee id");
int empno=s.nextInt();
Statement sct =con.createStatement();
String sql="select * from employee";
ResultSet rs=sct.executeQuery(sql);
boolean result=false;
while(rs.next())
{
//verify input empno with first column of ur table
if(empno==rs.getInt(1))
{
	System.out.println("you are valid user");
	System.out.println("hello"+rs.getString(2));
	System.out.println(rs.getInt(3));
	result=true;
	break;
}}
if(result==false)
{
System.out.println("invaild");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
