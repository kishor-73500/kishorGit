package day4.LacalGlabalVariable;

public class NonstaticVariable1 {
	int mobNum=123;//NSGV
	public static void main(String[] args) {
		System.out.println("programme start...........");
		//creating object or instance of class
		NonstaticVariable1 ref;//no object created for this line it is just like variable name
		ref= new NonstaticVariable1();//object created
		System.out.println("1st ref, Non Static Globle Variable :" +ref.mobNum);//123
		ref.mobNum=456;
		System.out.println("1st ref,Updated Non Static Globle Variable :" +ref.mobNum);//456
		
		NonstaticVariable1 ref1 = new NonstaticVariable1();//2nd intance or object creation
		
		System.out.println("2st ref, Non Static Globle Variable :" +ref1.mobNum);//123
		System.out.println("programme end...........");
	}

}
