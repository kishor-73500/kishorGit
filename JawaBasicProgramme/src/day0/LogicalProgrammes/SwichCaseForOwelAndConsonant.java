package day0.LogicalProgrammes;

public class SwichCaseForOwelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='i';//find any char
		
		switch(ch) {
		
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println(ch+" is vowel");
			break;
			
			default:
				System.out.println(ch+" is consonant");
		}

	}

}
