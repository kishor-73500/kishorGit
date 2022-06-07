package day0.LogicalProgrammes;

//count number of digit in integer using while loop
public class CountNumOFDigits {

	public static void main(String[] args) {
		
		int num=3424357 ;
		
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			
			count=count+1 ;
		}
		{
		System.out.println(count);//o/p=7 
		}
		
		//count number of digit in integer using for loop
		int num2=12345;
		int count1=0;
		for(;num2>0;count1++) {
			num2=num2/10;
		}
		System.out.println(count1);//o/p=5
	}

}
