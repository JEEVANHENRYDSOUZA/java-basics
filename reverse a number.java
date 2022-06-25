import java.util.Scanner;



public class installjava{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);   
          int age =sc.nextInt();
		 
        System.out.println("this is mathematics ");
        System.out.println("pallindrome numbers");
        checkpallindrome(age);
     
    }




public static void checkpallindrome(int age) {
    int temp=age;
    int age3=0;
    int reverse=0;
    while(age>0){
        age3=age%10;
        reverse=reverse*10+age3;
        age=age/10;

    }
    if(temp==reverse){
        System.out.println("it is a pallindrome ");
        System.out.println(reverse);
        return;

    }
    else{
        System.out.println("it is not a pallindrome");
    }
    
}}


//time complexity log(n)
