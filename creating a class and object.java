//import java.util.Scanner;

public class installjava{

    //creating a class 

    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);   
         // int age =sc.nextInt();
		 
        System.out.println("this is oops lecture in java");
        animal a1=new animal();
        animal a2=new animal();//creating another object new memory is allocated refernece by a2

      a1.name="SIMBA";
      a1.legs=20;
      System.out.println(a1.name);
      System.out.println(a1.legs);
      a2.name="jeevan";
      a2.legs=30;
      System.out.println(a2.name);
      System.out.println(a2.legs);
    }
}

//what is an object?
//object is the actual real world implementation of the entity
//what is a class?
//class is a blue print of the object


//creating a class in java

class animal{
    int legs;
    String name;
}
