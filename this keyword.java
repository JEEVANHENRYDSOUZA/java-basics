//import java.util.Scanner;

public class installjava{

    //creating a class 

    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);   
         // int age =sc.nextInt();
		 
        System.out.println("this is oops lecture in java");
        animal a1=new animal(10,"jeevan");
        animal a2=new animal(30,"anuj");//creating another object new memory is allocated refernece by a2
        System.out.println(a1.legs);
        System.out.println(a2.legs);
        //this refers to current object
      
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
    

    
    public animal(int legs,String name){
        this.name=name;
        this.legs=legs;

    }

    //we cannot create another function with the name as walk
    //same function with different parameters is overloading
}

//constructor is a method ,the only difference is that its name is the same as that of the class
//constructor should be public


//static method---do not change with different object creation or in other words they are static
//static means thing which does not change ---can be accessed using class name
