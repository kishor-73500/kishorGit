package day10.methods;

public class Method5 {
static int age=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=getAdditionResult(25,30);//sum just ref variable hai jo pt krata hai 25,30
		System.out.println("Result of Addition:" +sum);
		
		System.out.println(getAdditionResult(250.36,45));// direct call or with std...>>>Method5.getAdditionResult(250.36,45)

	}
static double getAdditionResult(double num1,double num2) {
	double res=num1+num2;
	return res;
}
}
