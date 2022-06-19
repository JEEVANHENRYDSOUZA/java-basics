class 

    public static void main(String[] args){

        //Scanner sc=new Scanner(System.in);   
         // int age =sc.nextInt();
		samsung s10=new samsung();  
        System.out.println(s10.dimension);
        //this refers to current object
      
    }
}

//what is an object?
//object is the actual real world implementation of the entity
//what is a class?
//class is a blue print of the object


//creating a class in java
class samsung extends mobilephone{}
class apple extends mobilephone{}


class mobilephone{
    int dimension;
    String os;


}
//inheritance taking properties from parent class to child class
//class re-uasability without writing it again and again
