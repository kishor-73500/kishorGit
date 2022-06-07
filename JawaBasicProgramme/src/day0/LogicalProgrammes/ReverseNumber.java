package day0.LogicalProgrammes;

//Reverse the number using while loop
public class ReverseNumber {

	public static void main(String[] args) {
	
		int number=1234;
		
		int remainder=0;
		
		int reverse=0;
		
		while(number>0) {
			
			remainder=number%10;
			
			reverse=reverse*10 + remainder;
			
			number=number/10;
		}
		{
		System.out.println("reverse number is "+reverse);
		}
		
		//Reverse the number using for loop
		
		int num=1234;
		int rem=0;
		int rev=0;
		
		for(;num>0;num=num/10) {
			
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse number is "+rev);

	}

}
