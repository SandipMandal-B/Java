import java.util.ArrayList;
import java.util.List;

public class SubsetsOfString {
    public static void main(String[] args) {
        String inputString = "abc";
        int subsetLength = 2;
        
        List<String> subsets = findAllSubsets(inputString, subsetLength);
        
        System.out.println("All subsets of length " + subsetLength + " in " + inputString + ":");
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }
    
    public static List<String> findAllSubsets(String str, int length) {
        List<String> subsets = new ArrayList<>();
        findAllSubsetsHelper(str, length, 0, new StringBuilder(), subsets);
        return subsets;
    }
    
    private static void findAllSubsetsHelper(String str, int length, int index, StringBuilder current, List<String> subsets) {
        if (current.length() == length) {
            subsets.add(current.toString());
            return;
        }
        if (index == str.length()) {
            return;
        }
        // Include current character
        findAllSubsetsHelper(str, length, index + 1, current.append(str.charAt(index)), subsets);
        current.deleteCharAt(current.length() - 1);
        // Exclude current character
        findAllSubsetsHelper(str, length, index + 1, current, subsets);
    }
}
