package day10.methods;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Hi,Good morning everyone");
		System.out.println("Staying in pune");
		System.out.println("I am 30 year old");
		System.out.println("I am getting 960000");
		
		System.out.println("Hi,Good morning everyone");
		System.out.println("Staying in pune");
		System.out.println("I am 25 year old");
		System.out.println("I am getting 560000");
		
		System.out.println("Hi,Good morning everyone");
		System.out.println("Staying in pune");
		System.out.println("I am 26 year old");
		System.out.println("I am getting 450000");*/
		printDetails(21,960000);
		printDetails(25,560000);
		printDetails(26,450000);
		

	}
	public static void printDetails(int age,int salary) {
		System.out.println("Hi,Good morning everyone");
		System.out.println("Staying in pune");
		System.out.println("I am"+age+"years old");
		System.out.println("I am getting "+salary);
		
	}

}

