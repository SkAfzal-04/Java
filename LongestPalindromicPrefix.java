import java.util.Scanner;

public class LongestPalindromicPrefix {

    public static boolean isPalindrome(String s, int end) {
        int start = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestPalindromicPrefix(String s) {
        for (int end = s.length() - 1; end >= 0; end--) {
            if (isPalindrome(s, end)) {
                return s.substring(0, end + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String longestPrefix = longestPalindromicPrefix(input);
        System.out.println("Longest palindromic prefix: \"" + longestPrefix + "\"");
        System.out.println("Length: " + longestPrefix.length());

        sc.close();
    }
}
