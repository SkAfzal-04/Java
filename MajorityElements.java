import java.util.HashMap;
import java.util.Scanner;

public class MajorityElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxCount = 0;
        int majorityElement = arr[0]; // default to first element

        // Find element with max frequency
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > maxCount) {
                maxCount = count;
                majorityElement = key;
            }
        }

        System.out.println("Majority element (max frequency): " + majorityElement);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}
