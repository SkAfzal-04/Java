import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline after int input

        System.out.println("Enter the strings separated by space:");
        String line = sc.nextLine();

        // Split by space into array of strings
        String[] input = line.split("\\s+");

        if (input.length != n) {
            System.out.println("Warning: Number of strings entered does not match the expected count.");
        }

        List<List<String>> groupedAnagrams = groupAnagrams(input);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }

        sc.close();
    }
}
