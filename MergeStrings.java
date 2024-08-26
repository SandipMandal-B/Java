public class MergeStrings {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World";
        
        String mergedString = mergeStrings(firstString, secondString);
        
        System.out.println("Merged String: " + mergedString);
    }
    
    public static String mergeStrings(String str1, String str2) {
        StringBuilder merged = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            merged.append(str1.charAt(i++));
            merged.append(str2.charAt(j++));
        }
        
        while (i < len1) {
            merged.append(str1.charAt(i++));
        }
        while (j < len2) {
            merged.append(str2.charAt(j++));
        }
        
        return merged.toString();
    }
}
