package LogicalProgram1_Array;

//java programe to copy elements of one array to another array.

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]=new int[] {1,3,5,8,7};//initilize first array
		int arr2[]=new int[arr1.length];//creay another array arr2 with same size as arr1
		for(int i=0;i<arr1.length;i++) {//copying all elements of arr1 to arr2
			arr2[i]=arr1[i];
		}
		System.out.println("Didsplay elements of second array");
		for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
		}
	}

}
