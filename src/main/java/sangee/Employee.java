package sangee;

public class Employee {
public String name="sangee";
private long phoneNo=984545343;
int age=32;
protected float salary=34332;

public void visibleMethod() {
	System.out.println("Public methods are visible to all class");
}
private void privateMethod() {
	System.out.println("Private methods are visible to within class");
}
 static void defaultMethod() {
	System.out.println("Default methods are visible to within pacckage");
}
protected  void protectedMethod() {
	System.out.println("Protected methods are visible to withinpackage and outside subpackage");
	visibleMethod();
}

public static void main(String[] args) {
	try {
		defaultMethod();
		Employee emp=new Employee();
		System.out.println(emp.name+" "+emp.phoneNo+" "+emp.age+" "+emp.salary);
		emp.visibleMethod();
		emp.privateMethod();
		emp.defaultMethod();
		emp.protectedMethod();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
