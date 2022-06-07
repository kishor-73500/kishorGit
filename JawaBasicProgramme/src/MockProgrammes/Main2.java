package MockProgrammes;

public class Main2 {

	public static void main(String[] args) {
		int a = Integer.parseInt("cppbuzz");
		System.out.print(a);

	}

}
import java.util.Scanner;

public class ReverseSplit {
 
    public static void main(String[] args) {
     
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
        String[] token = str.split("");    
        for(int i=token.length-1; i&gt;=0; i--)
        {
            System.out.print(token[i] + "");
        }
         
    }
 
}import java.util.Scanner;

public class ReverseSplit {

   public static void main(String[] args) {
    
       String str;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your String");
       str = in.nextLine();
       String[] token = str.split("");    
       for(int i=token.length-1; i&gt;=0; i--)
       {
           System.out.print(token[i] + "");
       }
        
   }

}
class Student3{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Student3 s1=new Student3();  
Student3 s2=new Student3();  
s1.display();  
s2.display();  
}  
}  