import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {
    static HashMap<Integer, Integer> indices = new HashMap<>();

    static int pairs(int k, int[] arr, int n) {
        // Complete this function
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            // System.out.print(indices.get(arr[i]) + ":");
            // System.out.println(arr[i]);
            if (indices.get(arr[i] + k) != null) {
                count += 1;
            }
        }
        // System.out.println(indices.get(6));
        // System.out.println(1);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int k = in.nextInt();
        int n = 5;
        int k = 2;
        int[] arr = new int[n];
        int[] arr_root = { 1, 5, 3, 4, 2 };
        for (int arr_i = 0; arr_i < n; arr_i++) {
            // arr[arr_i] = in.nextInt();
            arr[arr_i] = arr_root[arr_i];
            indices.put(arr[arr_i], arr_i);
        }
        int result = pairs(k, arr, n);
        System.out.println(result);
        in.close();
    }

}
