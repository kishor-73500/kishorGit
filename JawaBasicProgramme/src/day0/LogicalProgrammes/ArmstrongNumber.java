package day0.LogicalProgrammes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=371;//153;//1634; 
		int t1=num;
		int length=0;
		
		while(t1!=0) {
			length=length+1;
			t1=t1/10;
		}
		int t2=num;
		int arm=0;
		int rem;
		while(t2!=0) {
			int mul=1;
			 rem=t2%10;
			
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==num) {
			System.out.println(num+" is armstrong");
		}
		else {
			System.out.println(num+" is not armstrong");
			
		}
	

}
}