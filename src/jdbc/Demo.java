package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbc_db";//DBName=meri
		String user="root";//Oracle@123
		String pwd="root";//Meri@123
		
		String driverName="com.mysql.cj.jdbc.Driver";
		
		Class.forName(driverName);
		
		Connection con=DriverManager.getConnection(url,user,pwd);
		
		Statement st=con.createStatement();
		
		String tableName="student";
		
		// 1.Query for table creation "student"
	/*	String sqlQuery="create table "+tableName
				      + "(sid int, sname varchar(25),semail varchar(25))";
		
		st.execute(sqlQuery);
		
		System.out.println("table created"); */
		
		//2.Query for inserting values for table-student
		/*
		 *  Note:
		 *       for values we have use dynamic input which is Scanner.
		 */
		String sqlQuery="insert into "+tableName+" values(4,'sree','sree@gmail.com')";
		st.execute(sqlQuery);
		
		//3. Update Query
		
		
		
		
		System.out.println("success");
		
		
		
		
		st.close();
		con.close();
		
	}
}
