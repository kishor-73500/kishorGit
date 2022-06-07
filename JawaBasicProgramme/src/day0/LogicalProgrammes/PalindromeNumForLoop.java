package day0.LogicalProgrammes;

public class PalindromeNumForLoop {

	public static void main(String[] args) {
		
		int num=3553;
		int rev=0;
		int rem=0;
		int originalNum=num;
		
		for(;num>0;num=num/10) {
			
			rem=num%10;
			rev=rev*10+rem;
		}
		if(originalNum==rev) {
			System.out.println(originalNum+" is Palindrome");
		}
		else {
			System.out.println(originalNum+" is not Palindrome");
		}

	}

}
