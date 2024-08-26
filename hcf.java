public class hcf {

    public static int  gosagu(int a,int b){
        if (a>b){
            int temp = b;
            b = a;
            a = temp;
        }
        int hcf = 1;

        for (int i = 2; i<=a; i++){
            if(a % i == 0 && b % i ==0){
                hcf = i;
            }
        }

        return hcf;
    }

    public static int lcm(int a,int b){
        int lcm = a*b/gosagu(a,b);

        return lcm;

    }

    public static void main(String[] args) {
        int a =18,b = 12;
        System.out.println(lcm(a,b));


    }


    
}
