public class StringPerformanceComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        long startTime1 = System.nanoTime();
        String concatenatedString = concatenateStrings(str1, str2);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        
        long startTime2 = System.nanoTime();
        String stringBuilderConcatenatedString = stringBuilderConcatenateStrings(str1, str2);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        
        System.out.println("Time taken for concatenation using + operator: " + duration1 + " nanoseconds");
        System.out.println("Time taken for concatenation using StringBuilder: " + duration2 + " nanoseconds");
    }
    
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
    
    public static String stringBuilderConcatenateStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
