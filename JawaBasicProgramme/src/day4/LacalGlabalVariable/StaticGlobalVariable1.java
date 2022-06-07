package day4.LacalGlabalVariable;

public class StaticGlobalVariable1 {
	static int mobileNumber=123;//SGV
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme start.....");
		System.out.println("SGV :" +mobileNumber);//123
		System.out.println("SGV with standard :" +StaticGlobalVariable1.mobileNumber);//123
		System.out.println("**************************************");
		mobileNumber=456;//REINITIALISING SGV's value
		System.out.println("SGV :" +mobileNumber);//456
		System.out.println("SGV with standard :" +StaticGlobalVariable1.mobileNumber);//456
		System.out.println("**************************************");
		int mobileNumber=789;//local variable
		System.out.println("SGV :" +mobileNumber);//789
		System.out.println("SGV with standard :" +StaticGlobalVariable1.mobileNumber);//456 it will take SGV s reinitilise value//we call SDGV
		System.out.println("**************************************");

	}

}
