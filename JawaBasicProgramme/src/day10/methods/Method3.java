package day10.methods;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDetails(21,8000);//direct method name se call kiya hai
		Method3.printDetails(22,9000);//className.MethodName se call kiya hai
		printDetails(23,10000);
		printDetails(24,12000);
		printDetails(25,14000);

	}
public static void printDetails(int age,int salary) {//i add {} here
	System.out.println("Hi,Good morning everyone");
	System.out.println("Staying in pune");
	System.out.println("I am"+age+"years old");
	System.out.println("I am getting "+salary);
}
}
/* access modifier:public
non access modifier:static
return type:void
methodName:printDetails*/
