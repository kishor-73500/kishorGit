package day0.LogicalProgrammes;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String x="race";//"SILENT";// string case sensitive>>small, acpital
		String y="care";//"LISTEN";
		
		//convert string into char array
		char[] a= x.toCharArray();
		char[] b=y.toCharArray();
		
		//sort array
		Arrays.sort(a);
		Arrays.sort(b);
		
		//compare arrays
		boolean result=Arrays.equals(a,b);
		
		if(result == true) {
			System.out.println("Given strings are Anagram");
		}
		else
			System.out.println("Given strings are not Anagram");

	}

}
