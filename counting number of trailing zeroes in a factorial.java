import java.util.Scanner;



public class installjava{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);   
          int number =sc.nextInt();
		 
        System.out.println("this is mathematics ");
        System.out.println("trailinng zero in factorail");
        findingtrailingzero(number);
     
    }

public static int findingtrailingzero(int number) {
    //we will get a zero only when we multiply 2 by 5 or basically count the number of 5 that will give trailing zero
    int count=0;
    while(number>0){
        count=count+number/5;
        number=number/5;
    }
    System.out.println(count);
    return 1;

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
    
}
public static int gcd(int a,int b) {


    for(int i=(a>b)?b:a;i>0;i--){
        if(a%i==0 && b%i==0){
            System.out.println("it has a divisor");
            return i;

        }
    }
    return 1;

    
}


}

