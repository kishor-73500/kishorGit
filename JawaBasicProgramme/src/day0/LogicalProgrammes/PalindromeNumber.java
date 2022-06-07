package day0.LogicalProgrammes;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=1221;
		int rev=0;
		int rem=0;
		int orignalNum=num;
		
		while(num>0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orignalNum==rev) {
			System.out.println(orignalNum+" is Palindrome");
		}
		else {
			System.out.println(orignalNum+" is not Palindrome");
		}
		

	}

}
