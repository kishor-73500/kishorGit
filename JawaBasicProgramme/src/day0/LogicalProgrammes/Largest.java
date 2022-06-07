package day0.LogicalProgrammes;

// Find largest among three number using if else statement
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1=-4.5, n2=3.1, n3=2.5;// pass diff num to test
		
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+" is the largest number.");
		
		else if(n2>=n1 && n2>=n3)
			System.out.println(n2+" is the largest number.");
		
		else 
			 System.out.println(n3+" is the largest number.");

	}

}
