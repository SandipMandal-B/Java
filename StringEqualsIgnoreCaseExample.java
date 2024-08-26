public class StringEqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        
        boolean isEqual1 = str1.equalsIgnoreCase(str2);
        boolean isEqual2 = str1.equalsIgnoreCase(str3);
        
        System.out.println("str1 equals (ignoring case) str2? " + isEqual1);
        System.out.println("str1 equals (ignoring case) str3? " + isEqual2);
    }
}
