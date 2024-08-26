import java.util.*;
public class arr {

    public static void printarr(){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i <= size-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("output");
        for(int i = 0; i<= size-1; i++){
            System.out.println(arr[i]);
        }

        

    }

    public static  void arrayprint(){
        int arr[] ={1,2,3,4,5,6,7,8,9} ;

        for(int i = 0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
        // System.out.println(arr.length);
    }

    public static void arrSearch(){
        int arr[] ={1,2,3,4,5,6,7,8,9} ;

        for(int i = 0; i<= arr.length-1; )
    }



    public static void main(String[] args) {
        
    }

    
}