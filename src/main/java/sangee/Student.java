package sangee;

public class Student {
	public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	int rollno;
	String name;
		
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	

}
