package teachingDAO;

public class Maincla {

	public static void main(String[] args) throws Exception {
		DaoImpl dao = new DaoImpl();
		Data d = dao.needDetails(1); //Data d = new Data(rs.getInt(1),rs.getString(2),rs.getInt(3));
		System.out.println(d.toString());
		Data data = new Data(3,"aathav",50);
		int r = dao.newstudent(data);
		if(r==1) {
			System.out.println("student added successfully");
		}
		else {
			System.out.println("invalid data");
		}
		Data d2 = new Data(2,24);
		int r2 = dao.updatedetails(d2);
		if(r2>0) {
			System.out.println("student detail updated successfully");
		}
		else {
			System.out.println("invalid data");}
	
	}

}
