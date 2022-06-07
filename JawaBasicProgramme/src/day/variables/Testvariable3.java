package day.variables;

public class Testvariable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=30,result;
		result = num1 + num2;
		result = num1/num2;
		double Diviresult = num1/num2;
		System.out.println("Number1: " +num1);
		System.out.println("Number2: " +num2);
		System.out.println("Division Result :" +Diviresult);
		Diviresult = num1/30.0;
		System.out.println("Number1: " +num1);
		System.out.println("Number2: " +num2);
		System.out.println("Division Result :" +Diviresult);//0.6666666666666 bcs double stored hai
		/*int result = 20 + 30;
		System.out.println("Addition result: " +result);*/
		System.out.println(20+30+10);
		System.out.println("20"+30+10);
		System.out.println(20+30+"10");
		System.out.println(20+30+"Hello");
		System.out.println("Hello"+20+30);
		int r=10;
		double res;
		res=(22/7)*r*r;
		System.out.println("Result1:" +res);//300.0
		res= 3.14*r*r;
		System.out.println("Result2:"  +res);//314.0
		double res2=65/4;
		System.out.println("Result3:" +res2);//16.0
		res2=65/4.0f;
		System.out.println("Result4:" +res2);//16.25 bcs 4.0f float declair hai
		res2=65/4.0d;
		System.out.println("Result5:" +res2);//16.25 bcs double decair
		int mod=2700%7;//o/p reminder
		System.out.println("mod:" +mod);
		
		
		
		
		
		
	
	}

}
