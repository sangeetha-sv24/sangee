package Testing;

class Student {
int studentId;
String studentName;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Student(int studentId, String studentName) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
}
}
