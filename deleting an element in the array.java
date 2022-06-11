package helloworld;

import java.util.Scanner;

public class hello {
	public static void delete(int array[]) {
		int i;
		for(i=0;i<array.length;i++) {
			if(array[i]==2) {
				break;
			}
		}
		
		for(int j=i;j<array.length-1;j++) {
			array[j]=array[j+1];
		}
	}
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
		
		
		//Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    //System.out.println("Enter your age");

	    //int age = sc.nextInt();  // Read user input
	    System.out.println("creating an array in java");
	    //memory is continuosly allocated in java
	    //they store similar type of data
	    //creating an array in java
	    int[] marks= {2,1,6,4,5};
	    for(int i=0;i<marks.length;i++) {
	    	
	    	if(marks[i]==5) {
	    		System.out.println("match found");
	    	}
	    }
	   // System.out.println(marks[0]);
	    delete(marks);
	    for(int k=0;k<marks.length;k++) {
         System.out.println(marks[k]);}
        
	}

}
//time complexity is o(n)
