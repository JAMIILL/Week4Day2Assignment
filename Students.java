package Week4Day2Assignments;

public class Students {
	
	public void getStudentInfo(int ID) {
		System.out.println("Student ID is "+ ID);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID is "+ id+" Student Name is "+name);
	}
	public void getStudentInfo(String email, long phonenumber) {
	System.out.println("Email ID is "+email+ " Student Number is "+phonenumber);
	
	}

	public static void main(String[] args) {
		Students student=new Students();
		student.getStudentInfo(7323);
		student.getStudentInfo(7323,"Jam");
		student.getStudentInfo("jam@123",987654532);

}}