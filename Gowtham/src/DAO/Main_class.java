package DAO;

public class Main_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student_DAO dao=new Student_DAO();
		Student s=dao.getStudent(1);
		System.out.println(s.toString());
		Student student=new Student(5,"Logi",30);
		int rows=dao.addStudent(student);
		if(rows>0) {
			System.out.println("value inserted successfully");
		}
		else {
			System.out.println("values not inserted");
		}
		System.out.println(dao.getStudent(student.getId()));
		
		int r=dao.updateStudent(1,23);
		if(r>0) {
			System.out.println("values updatede successfully");
		}
		else {
			System.out.println("values not updated");
		}
		System.out.println(dao.getStudent(1));
		
		

	}

}
