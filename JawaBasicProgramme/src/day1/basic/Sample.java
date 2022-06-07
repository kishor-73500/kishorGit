package day1.basic;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Good Morning");
System.out.println("good evening bhakti");
System.out.println("i have completed my programme today");
System.out.println("End of programme");

//swapping two numbers without 3rd variable
int a=10,b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("a :"+a);
System.out.println("b :"+b);

// or swapping two numbers with 3rd variable
int x= 30,y=40;
int t;
t=x;
x=y;
y=t;
System.out.println("x :"+x);
System.out.println("y :"+y);

// addition of two integer
int p=10,q=20,sum;
sum=p+q;
System.out.println("Addition :"+sum);

//multiplication of two floating numbers
float num1=1.5f,num2=2.0f,product;
product=num1*num2;
System.out.println("Product :"+product);//3.0
	}

}
