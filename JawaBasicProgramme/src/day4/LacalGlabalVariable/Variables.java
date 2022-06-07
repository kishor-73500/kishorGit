package day4.LacalGlabalVariable;
//global variables
public class Variables {
	double salary;
	static char grade;
	int age=28;
	static int empID=123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("programme start**********");

int empID=456;//lacal variable
System.out.println("local empID with std :" +empID);
System.out.println("SGV grade with std :" +Variables.grade);
System.out.println("SGV grade withot std :" +grade);
System.out.println("SGV grade with std :" +Variables.empID);

Variables v1=new Variables();
System.out.println("NSGV salary with std :" +v1.salary);
System.out.println("NSGV age with std :" +v1.age);

Variables v2=new Variables();
v2.salary=25000;
v2.age=30;
System.out.println("NSGV salary with std :" +v2.salary);///25000.0...>>bcs it has datatype double
System.out.println("NSGV age with std :" +v2.age);

System.out.println("programme end**********");

	}

}
