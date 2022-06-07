package day0.LogicalProgrammes;

//Display uppercase alphabets using for loop 
public class DisplayAlphabets {

	public static void main(String[] args) {
	
	for(char c1='A';c1<='Z';c1++ ) {
		
		System.out.print(c1+" ");
	}
	
	System.out.println("\n");
	
	//Display Reverse uppercase alphabets using for loop 
	for(char c2='Z';c2>='A';c2--) {
		
		System.out.print(c2+" ");
	}

	}

}
