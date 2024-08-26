import java.util.*;

class sumOfNatual{

    static int Sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++ ){
            sum = sum+i;

        }
        return sum;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(Sum(x));


    }

}