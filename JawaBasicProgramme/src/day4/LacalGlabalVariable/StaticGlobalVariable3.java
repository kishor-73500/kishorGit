package day4.LacalGlabalVariable;

public class StaticGlobalVariable3 {
	static int empID;//default value
	static double salary;//default value
	static char grade;//default value
	static boolean isPM;//default value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("programme start.........");
		System.out.println("EmpID :" +empID);//0
		System.out.println("Salary :" +salary);//0.0
		System.out.println("Grade :" +grade);//blank space
		System.out.println("ispm :" +isPM);//false
		int age=25;//lacal varible mandatory to initilize before use them
		System.out.println(age);
		System.out.println("programme end...");
			
		

	}

}
