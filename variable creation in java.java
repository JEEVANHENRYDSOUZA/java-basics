//.java extension for java program 
//execution starts from main always
package helloworld;
import java.util.Scanner;

public class hello {

	public static void  main(String[] args) {
		//string is a non-primitive datatype
		//primitive original
         //int age=34;
         //sysout ctrl + space          
           
         // System.out.println("welcome to java ");//given some output to the console
          //printing a string inside system.out.println
          
              // Scanner sc=new Scanner(System.in);           
        		  // int age =sc.nextInt();
			//i//nt age=10;
        		   //System.out.println(age);
		
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your age");

	    int age = sc.nextInt();  // Read user input
	    System.out.println(age);
          
	}

}
