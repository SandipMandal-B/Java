package bank;

class Account{
    public String name; //can be accessed from any where
    public int AcNo; 

    protected int balance; // only accessed from this package and sub classes from another package

    private String password; // only accessed from this class not any whre else 
                                // can be accesed but using getter and setter
    


}

public class bankpackage {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "company 1";
        ac1.AcNo = 3210;

        
    }

    
}