package day0.LogicalProgrammes;

public class swappTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping two numbers using temparary variable
		int a=10, b=20 , t;
		t=a;
		a=b;
		b=t;
		
		System.out.println("a: "+a);//o/p=20
		System.out.println("b: "+b);//o/p=10
		
		//swapping two numbers wiyhout using temparary variable
		int x=30,y=40;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x: "+x);//o/p=40
		System.out.println("y: "+y);//o/p=30
		

	}

}
