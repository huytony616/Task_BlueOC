import java.util.*;

public class SLF {
    public static List<String> result(String[] strings) {
        if (strings == null || strings.length == 0) return Collections.emptyList();

        Map<Integer, Integer> lengthFreq = new HashMap<>();
        for (String s : strings) {
            int len = s.length();
            lengthFreq.put(len, lengthFreq.getOrDefault(len, 0) + 1);
        }

        int maxFreq = Collections.max(lengthFreq.values());
        Set<Integer> mostFrequentLengths = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : lengthFreq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                mostFrequentLengths.add(entry.getKey());
            }
        }

        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (mostFrequentLengths.contains(s.length())) {
                result.add(s);
            }
        }

        return result;
    }
    
    /*Check test cases by running project with JUnit Test*/
    public static void main(String[] args) {
        System.out.println(result(new String[]{"a", "ab", "abc", "cd", "def", "gh"})); // [ab, cd, gh]
        System.out.println(result(new String[]{})); // []
        System.out.println(result(new String[]{"a", "bb", "cc", "dd"})); // ["bb", "cc", "dd"]
        System.out.println(result(new String[]{"a", "ab", "abc", "abcd"})); // ["a", "ab", "abc", "abcd"]
    }
}
