package day0.LogicalProgrammes;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2022; //check for 2000,2004,2008,2024
		
		if((year%400 == 0) || (year%4 == 0 && year%100!=0)) {
			
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
