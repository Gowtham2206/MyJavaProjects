package teachingDAO;

import java.sql.*;


public class DaoImpl {
	public static Connection connection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "kumar");
		return con;
	}
	
	public Data needDetails(int roll) throws Exception {
		Connection c1 = connection();
		PreparedStatement pst = c1.prepareStatement("select * from students where roll_no = ?;");
		pst.setInt(1, roll);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			return new Data(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
		else {return null;}
	}
	public int newstudent(Data data) throws Exception {
		Connection c2 = connection();
		PreparedStatement pst = c2.prepareStatement("insert into students values (?,?,?);");
		pst.setInt(1, data.getRoll());
		pst.setString(2, data.getName());
		pst.setInt(3, data.getAge());
		int rows = pst.executeUpdate();
		if(rows>0) {
			return rows;
		}return 0;
	}
	public int updatedetails(Data d1) throws Exception {
		Connection c3 = connection();
		PreparedStatement pst = c3.prepareStatement("update students set age=? where roll_no=?;");
		pst.setInt(1, d1.getAge());
		pst.setInt(2, d1.getRoll());
		int rows = pst.executeUpdate();
		if(rows>0) {
			return rows;
		}return 0;	
	}

}
