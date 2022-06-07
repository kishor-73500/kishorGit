package day0.LogicalProgrammes;

//Write a java program to remove all white spaces from a given string.

public class RemoveAllWhiteSpacesFromAString {

	public static void main(String[] args) {
		String str=" k i sh  or ";
		str=str.replaceAll("\\s", "");//\\s is regular expression which remove all tabas, spaces,newline character
		System.out.println(str);

	}

}
