package day0.LogicalProgrammes;

public class ReverseAString {

	public static void main(String[] args) {
		String name="abc";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.print(rev);

	}

}
