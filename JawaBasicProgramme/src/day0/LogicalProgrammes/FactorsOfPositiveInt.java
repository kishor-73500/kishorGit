package day0.LogicalProgrammes;
// Java programme for factors of positive integers

public class FactorsOfPositiveInt {

	public static void main(String[] args) {
		
		int num=60;
		
		System.out.print("Factors of "+num+" are: ");//ln hai nahi 
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");// ln hai nahi 
			}
		}

	}

}
