package day4.LacalGlabalVariable;

public class NonStaticVariable2 {
	int mobileNum=123;//Nonstatic global Variable
	char grade;//Nonstatic global Variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme start......");
		System.out.println("************* r1 object **********");
		NonStaticVariable2 ref1= new NonStaticVariable2();//object created
		System.out.println("mobileNum with r1 reference :" + ref1.mobileNum);//refrence variable dot mobile num
		System.out.println("grade with r1 reference :" + ref1.grade);//blank space dega
		System.out.println("*********** x1 object**********");
		NonStaticVariable2 x1= new NonStaticVariable2();
		System.out.println("mobileNum with x1 reference :" + x1.mobileNum);
		System.out.println("grade with x1 reference :" + x1.grade);
		System.out.println("***********updated x1 object variables**********");
		x1.mobileNum=987;
		x1.grade='A';
		System.out.println("Updated mobileNum with x1 reference :" + x1.mobileNum);
		System.out.println("Updated grade with x1 reference :" + x1.grade);
		System.out.println("********* r1 object**********");
		System.out.println("mobileNum with r1 reference :" + ref1.mobileNum);
		System.out.println("grade with r1 reference :" + ref1.grade);//blank space
		System.out.println("programme end**********");
		
		
		
				
		
		
		

	}

}
