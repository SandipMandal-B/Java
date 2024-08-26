abstract class animall {
    public void eat(){
        animal(){
            System.out.println("this is animal constaractor");
    
        }

        System.out.println("can eat");
    }
}
class dog extends animall{
    dog(){
        System.out.println("this is a dog constructor");
    }
    public void ch(){
        
        System.out.println("this is dog ");
    }
}
class cat extends animall{
    public void ch(){
        System.out.println("this is a cat ");
    }
}
public class animal {
public static void main(String[] args) {
    dog dg = new dog();
    // animall animl = new animall();
    // animl.eat(); //this is beacuse we can not call abstract class



    dg.ch();
    dg.eat();

}
    
}
