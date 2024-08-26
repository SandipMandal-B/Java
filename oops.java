
class pen {
    String color;
    String type;

    public void write(){
        System.out.println(this.color);
    }

    
}

class student{
    String name;
    String stream;
    int roll;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int roll){
        System.out.println(roll);
    }
    public void printInfo(String name, int roll){
        System.out.println(name+" "+roll);
    }

    public void info(){
        System.out.println(this.name);
        System.out.println(this.stream);
        System.out.println(this.roll);
    }

}
import bankpackage;

class bank{

}


public class oops {

    public static void main(String[] args) {
        bankpackage.Account ac1 = new bankpackage.Account;

        ac1.name = "custome1";

        



        // pen pn = new pen();
        // pn.color = "blue";
        // pn.type = "ball point";

        // pen pn2 = new pen();
        // pn2.color = "red";
        // pn2.type = "gel";

        // pn.write();
        // pn2.write();


        // student s1 = new student();
        // s1.name = "abcd";
        // s1.roll = 1;
        // s1.stream = "MCA";

        // student s2 = new student();
        // s2.name = "efgh";
        // s2.roll = 2;
        // s2.stream = "MCA";

        // student s3 = new student();
        // s3.name = "xyz";
        // s3.roll = 3;
        // s3.stream = "MCA";


        


        
    }
    

    
}