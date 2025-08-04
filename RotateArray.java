import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of times to rotate to the right: ");
        int k = sc.nextInt();
        k = k % N; 

  
        reverse(arr, 0, N - 1);       
        reverse(arr, 0, k - 1);     
        reverse(arr, k, N - 1);       

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
