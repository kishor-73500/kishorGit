package day4.LacalGlabalVariable;

public class Unaryop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b;
		b=a++ + ++a + ++a + a;
		System.out.println(a);
		System.out.println(b);
		a=0;
		b= a-- + --a + --a + a;
		System.out.println(a);
		System.out.println(b);
		a=0;
		b=--a + --a + --a + a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		a=0;
		b=a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);
		System.out.println(b);

	}

}
