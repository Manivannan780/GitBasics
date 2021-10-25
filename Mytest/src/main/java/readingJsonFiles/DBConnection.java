package readingJsonFiles;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection obj=new DBConnection();
		obj.dbOperation();
	}

	
	public void dbOperation() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection conobj=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
				Statement statementobj=conobj.createStatement();
				ResultSet resultobj= statementobj.executeQuery("SELECT * FROM student.stu_marks;");
				while(resultobj.next()) {
					System.out.println(resultobj.getString(2));
					System.out.println(resultobj.getInt(1));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
