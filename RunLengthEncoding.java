import java.util.Scanner;

public class RunLengthEncoding {

    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) != input.charAt(i - 1)) {
                encoded.append(input.charAt(i - 1));
                encoded.append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to encode: ");
        String input = sc.nextLine();

        String encoded = encode(input);
        System.out.println("Encoded string: " + encoded);

        sc.close();
    }
}
