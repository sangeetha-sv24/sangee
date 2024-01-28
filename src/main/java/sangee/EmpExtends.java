package sangee;

public class EmpExtends extends Employee {
	{
		System.out.println("Welcome");
	}
	static {
		System.out.println("Static block");
	}
static void test() {
	System.out.println("Test Method");
}
	public static void main(String[] args) {
		
		EmpExtends es=new EmpExtends();
		// TODO Auto-generated method stub
		EmpExtends emp=new EmpExtends();
		//Private valriable and methods cannot use outside class
		//System.out.println(emp.name+emp.phoneNo+emp.age+emp.salary);
		emp.visibleMethod();
		//emp.privateMethod();
		emp.defaultMethod();
		emp.protectedMethod();
		

	}

}
