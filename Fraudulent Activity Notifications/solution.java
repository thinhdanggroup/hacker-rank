import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {
  atic int activityNotifications(int[] expenditure, int d) {
    // Complete this function
    boolean odd = d%2||1;
    return 1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    // int d = in.nextInt();
    int n = 9;
    int d = 5;
    int[] data = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
    int[] expenditure = new int[n];
    for (int expenditure_i = 0; expenditure_i < n; expenditure_i++) {
      // expenditure[expenditure_i] = in.nextInt();
      expenditure[expenditure_i] = data[expenditure_i];
    }
    int result = activityNotifications(expenditure, d);
    System.out.println(result);
    in.close();
  }
}
