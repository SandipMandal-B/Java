import java.util.*;

class fun{
    // public static int sum(int a, int b){
    //     int c = a+b;
    //     return c;

    // }
    
    static int fact(int n){
        int factorial = 1;

        for (int i =  n; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = sc.nextInt();

        System.out.println("Factorial of "+a+" is "+fact(a));


    }
}