package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		 
		String sqlQuery="insert into "+tableName+" values(4,'sree','sree@gmail.com')";
		st.execute(sqlQuery); */
		
		//3.Select Query:Retrieving data from table:
	/*	String sqlQuery="select * from "+tableName;
		st.execute(sqlQuery);
		ResultSet rs=st.getResultSet();
		System.out.println("SID\tSNAME\tSEMAIL");
		System.out.println("=================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		} */
		
		//delete-Query: <delete from tableName :condition:>
		
	/*	String sqlQuery="delete from student "
				      + "where sid=4";
		int executeUpdate = st.executeUpdate(sqlQuery);
		System.out.println(executeUpdate); */
		
		String sqlQuery="update student "
	                  + "set sname=tj semail=tj@gmail.com where sid=1";
        int executeUpdate = st.executeUpdate(sqlQuery);
        System.out.println(executeUpdate); 
		
		st.close();
		con.close();
		
	}
}
