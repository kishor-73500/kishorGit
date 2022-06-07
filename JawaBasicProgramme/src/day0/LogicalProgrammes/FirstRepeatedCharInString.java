package day0.LogicalProgrammes;
//java program to find first repeated character in given string
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharInString {

	public static void main(String[] args) {
		String str="shoot tutorials";
		Set<Character> s1=new HashSet<Character>();//set doesn't allow duplicate
		for(int i=0;i<str.length();i++) {
			if(!s1.add(str.charAt(i))) {// symbol ! at index 3 see it is duplicate>>doesn't allow it to add and print it(o) and break the loop
				System.out.println(str.charAt(i)+" is first repeated character in given string.");
				break;
			}
		}

	}

}
