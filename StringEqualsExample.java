public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        
        System.out.println("str1 equals str2? " + isEqual1);
        System.out.println("str1 equals str3? " + isEqual2);
    }
}
