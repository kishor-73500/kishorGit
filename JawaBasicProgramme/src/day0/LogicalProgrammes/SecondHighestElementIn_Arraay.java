package day0.LogicalProgrammes;

import java.util.Arrays;

public class SecondHighestElementIn_Arraay {

	public static void main(String[] args) {
	int[] arr= {1,20,5,6,10,16};
	Arrays.sort(arr);//imp
	System.out.println("Second highest element in array: "+arr[arr.length-2]);//o/p=16

	}

}
//System.out.println(" highest element in array: "+arr[arr.length-1]);
//System.out.println("third highest element in array: "+arr[arr.length-3]);