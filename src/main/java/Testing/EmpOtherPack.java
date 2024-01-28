package Testing;

import sangee.EmpExtends;
import sangee.Employee;

public class EmpOtherPack extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Private, default valriable and methods cannot use outside package
		EmpOtherPack emp=new EmpOtherPack();
	//	System.out.println(emp.name+emp.phoneNo+emp.age+emp.salary);
		emp.visibleMethod();
		//emp.privateMethod();
		//emp.defaultMethod();
		emp.protectedMethod();
		
	}

}
