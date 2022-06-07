package day4.LacalGlabalVariable;

public class StaticGlobleVariable2 {
	static int age=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme start.....");
		System.out.println("SGV :" +age);
		System.out.println("SGV with standard :" +StaticGlobleVariable2.age);
		System.out.println("**************************************");
		age=30;
		System.out.println("SGV :" +age);
		System.out.println("SGV with standard :" +StaticGlobleVariable2.age);
			
		int age1=40;//local variable
		System.out.println("SGV :" +age1);
		System.out.println("SGV with standard :" +StaticGlobleVariable2.age);
		System.out.println("****************************end programme");
	}

}
