package day0.LogicalProgrammes;

public class Vowel_Consonantcount {

	public static void main(String[] args) {
		System.out.println("Vovels ct :"+checkOvelsCt('a','z'));//2
		System.out.println("cons ct :"+checkConsCt('a','z'));//3

	}
	public static int checkOvelsCt(char start,char ends) {//2
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				ct=ct+1;
			}
		}
		return ct;
	}
	public static int checkConsCt(char start,char ends) {//3 
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(!(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')) {// keep remember not equal to sign aahe
				ct=ct+1;
			}
		}
		return ct ;

	}

}
