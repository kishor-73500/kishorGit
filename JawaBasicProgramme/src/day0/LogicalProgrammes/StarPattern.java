package day0.LogicalProgrammes;
// star pattern by simple method
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	System.out.println("*");
	System.out.println("**");
	System.out.println("***");
	System.out.println("****");
	System.out.println("*****");*/
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
