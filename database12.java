import java.sql.*;
//import org.sqlite.*;
public class database12
{
public static void main(String [] args)
{
Connection c=null;
Statement st=null;
try{
Class.forName("org.sqlite.JDBC");
c=DriverManager.getConnection("jdbc:sqlite:DATABASE.db");
System.out.println("DATABASE CONNECTED");
//st=c.createStatement();

//st.execute("insert into databases(name,RollNo,Age)values('abc',25,21)");
//st.execute("delete from databases where RollNo=25");
//st.close();
//c.close();
}
catch (Exception e)
{
System.out.println(e);
}

}
}
