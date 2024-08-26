import java.util.*;

class miles{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter miles: ");
        int ml = sc.nextInt();

        double km = ml*1.609344;

        System.out.println("Converted to KM" + km);

    }
}