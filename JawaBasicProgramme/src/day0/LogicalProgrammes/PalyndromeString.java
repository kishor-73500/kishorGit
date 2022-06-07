package day0.LogicalProgrammes;

//java program for String palindrome

public class PalyndromeString {

	public static void main(String[] args) {
		String name="aba";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Palyndrome String");
		}
		else
			System.out.println("String is not Palyndrome ");
		

	}

}
