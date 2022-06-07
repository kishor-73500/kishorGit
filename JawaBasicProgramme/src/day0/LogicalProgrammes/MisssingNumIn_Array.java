package day0.LogicalProgrammes;

public class MisssingNumIn_Array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6};
		int expected_No_Elements=a.length+1;
		
		int totalSum=expected_No_Elements*(expected_No_Elements+1)/2 ;
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println("Missing no is: "+(totalSum-sum));

	}

}
