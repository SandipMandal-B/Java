import java.util.*;
public class mul10 {
    public static void  mulByTen(int n){

        for (int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }

        return;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        mulByTen(x);
        
    }


    

    
}