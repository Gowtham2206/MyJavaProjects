package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class jdbcdemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		/*
		 * driver loading
		 * connection object creation
		 * statement objection creation
		 * resultset object
		 */
//		int id=7;
//		String name="gobi";
//		String course="trainer";
//		int pwd=1475;
//System.out.println("insert into students values("+id+",'"+name+"','"+course+"',"+pwd+");");
//		insertusingvar();
//		insert();
		insertusingpst();
		read();

	}
	static void read() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loading
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1", "root", "mysql123");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from students");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
//		System.out.println("driver loaded");
	}
	static void insert() throws ClassNotFoundException, SQLException{
		String q="insert into students values(6,'logi','trainer',1245);";
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loading
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1", "root", "mysql123");
		Statement s=con.createStatement();
		int rows=s.executeUpdate(q);
		System.out.println("no of rows affected "+rows);
//		System.out.println("driver loaded");
	}
	static void insertusingvar() throws ClassNotFoundException, SQLException{
		int id=7;
		String name="gobi";
		String course="trainer";
		int pwd=1475;
//		System.out.println("my id is "+id);
//		String q="insert into students values(6,'logi','trainer',1245);";
		String q="insert into students values("+id+",'"+name+"','"+course+"',"+pwd+");";
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loading
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1", "root", "mysql123");
		Statement s=con.createStatement();
		int rows=s.executeUpdate(q);
		System.out.println("no of rows affected "+rows);
//		System.out.println("driver loaded");
	}
	static void insertusingpst() throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of id: ");
		int id=sc.nextInt();
		System.out.print("enter the name: ");
		String name=sc.next();
		System.out.print("enter the course: ");
		String course=sc.next();
		System.out.print("enter the password: ");
		int pwd=sc.nextInt();
//		System.out.println("my id is "+id);
//		String q="insert into students values(6,'logi','trainer',1245);";
		String q="insert into students values(?,?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");//driver loading
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/velacheryb1", "root", "mysql123");
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setString(3, course);
		ps.setInt(4, pwd);
		int rows=ps.executeUpdate();
		System.out.println("no of rows updated "+rows);
		
		
		
		
		
	}

}
