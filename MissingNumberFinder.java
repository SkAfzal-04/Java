// import java.util.Scanner;

// public class MissingNumberFinder {
//     public int size;
//     public int[] arr;

//     public MissingNumberFinder(int[] arr) {
//         this.arr = arr;
//         this.size = arr.length;
//     }

//     public int findMissingNumber() {
//         for (int i = 0; i < size - 1; i++) {
//             if (arr[i + 1] != arr[i] + 1) {
//                 return arr[i] + 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int size = scanner.nextInt();

//         int[] userArray = new int[size];
//         System.out.println("Enter " + size + " sorted numbers (with one missing number in sequence):");
//         for (int i = 0; i < size; i++) {
//             userArray[i] = scanner.nextInt();
//         }

//         MissingNumberFinder finder = new MissingNumberFinder(userArray);
//         int missing = finder.findMissingNumber();

//         if (missing == -1) {
//             System.out.println("No missing number found in the sequence.");
//         } else {
//             System.out.println("Missing number: " + missing);
//         }

//         scanner.close();
//     }
// }

//or

import java.util.*;

public class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int N = sc.nextInt();
        long total = (long) (N + 1) * (N + 2) / 2;
        for (int i = 0; i < N; i++)
            total -= sc.nextInt();
        System.out.println(total);
        sc.close();
    }
}
