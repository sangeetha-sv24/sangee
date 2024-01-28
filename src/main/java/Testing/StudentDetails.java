package Testing;

public class StudentDetails extends Student{

	public StudentDetails(int studentId, String studentName) {
		super(studentId, studentName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1=new Student(100,"Arun");
		System.out.println(std1);
		Student std2=new Student(100,"Arun");
		System.out.println(std2);
		System.out.println(std1.getStudentId());
		if(std1.equals(std2))
			System.out.println("Both objects are equal");
		else
			System.out.println("Both objects are not equal");
	if(std1.getStudentId()==std2.getStudentId()&&std1.getStudentName()==std2.getStudentName()){
		System.out.println("Both objects are equal");
	} 
	else
		System.out.println("Both objects are not equal");
	}

}
