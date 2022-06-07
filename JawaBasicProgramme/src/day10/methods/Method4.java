package day10.methods;

public class Method4 {
	public static void printDetails(int age,int salary) {// can write method above main method
		System.out.println("Hi,Good morning everyone");
		System.out.println("Staying in pune");
		System.out.println("I am "+age+ " years old");
		System.out.println("I am getting "+salary);
	}

	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
		printDetails(40,8000);//direct method name se call kiya hai
		Method3.printDetails(50,9000);//className.MethodName se call kiya hai
		printDetails(60,10000);
		printDetails(24,12000);
		printDetails(70,14000);

	}

}
