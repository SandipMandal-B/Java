import java.util.*;

class if_else{
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Month number: ");
        int month = inp.nextInt();
        String season;

        // Scanner inp = new Scanner(system.in);

        //  int month = inp.nextInt();

        Scanner inp = new Scanner(system.in);
        int input = inp.newInt();
        

        if(month == 12 || month ==1 || month == 2)
            season = "winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "autumn";
        
        else 
            season = "bogus month ";

        System.out.println("the season is "+ season);
    }
}