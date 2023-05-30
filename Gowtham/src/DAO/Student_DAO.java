package DAO;

import java.sql.*;


public class Student_DAO {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loaded
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1","root", "mysql123");
		return con;
	}
	
	public Student getStudent(int id) throws Exception{
		Student s=null;
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loaded
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1","root", "mysql123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employees where id="+id);
		if(rs.next()) {
			return new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
				
		return s;
		
	}
	public int addStudent(Student student) throws Exception {
		int row=0;
		Connection con=getConnection();
	    PreparedStatement pst=con.prepareStatement("insert into employees values(?,?,?)");
		pst.setInt(1,student.getId());
		pst.setString(2,student.getName());
		pst.setInt(3,student.getAge());
		row=pst.executeUpdate();
		
		
		return row;
	}
	public int updateStudent(int id,int age) throws Exception {
		int row=0;
		Connection con=getConnection();
	    PreparedStatement pst=con.prepareStatement("update employees set age=? where id=?");
		pst.setInt(1,age);
		pst.setInt(2,id);
		row=pst.executeUpdate();
		
		
		return row;
		
	}

}
