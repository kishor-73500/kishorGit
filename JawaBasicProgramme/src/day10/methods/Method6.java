package day10.methods;

public class Method6 {
	//simple interest=(principle*rate of interest*time)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Get interest using getInterest():" +Method6.getInterest(250000,6.5,60));//975000.0
		System.out.println("Get interest using getInterest1():" +Method6.getInterest1(250000,6.5,60));//975000.0
		Method6.getInterest2(350000,5,36);
		System.out.println("******************");
		double res=Method6.getInterest(250000,6.5,60);
		System.out.println(res);//975000.0
		

	}
	public static double getInterest(int p,double r,int t) {
		return (p*r*t)/100;
	}
	//or
	public static double getInterest1(int p,double r,int t) {
		double res=(p*r*t)/100;
		return res;
	}
	//or
	public static void getInterest2(int p,double r,int t) {
		double res=(p*r*t)/100;
		System.out.println("Interest is:" +res);//630000.0
		
		
	}

}
