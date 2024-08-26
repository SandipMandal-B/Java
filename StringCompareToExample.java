public class StringCompareToExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);
        
        System.out.println("Comparison of str1 with str2: " + result1);
        System.out.println("Comparison of str1 with str3: " + result2);
    }
}
