public class StringCompareToIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        
        int result1 = str1.compareToIgnoreCase(str2);
        int result2 = str1.compareToIgnoreCase(str3);
        
        System.out.println("Comparison of str1 with str2 (ignoring case): " + result1);
        System.out.println("Comparison of str1 with str3 (ignoring case): " + result2);
    }
}
