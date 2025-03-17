import java.util.*;

class Solution {
  
  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    int top = 0, bottom = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
        // Top row
        for (int i = left; i <= right; i++) {
            res.add(matrix[top][i]);
        }
        top++;

        // Right column
        for (int i = top; i <= bottom; i++) {
            res.add(matrix[i][right]);
        }
        right--;

        if (top <= bottom) {
            // Bottom row
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if (left <= right) {
            // Left column
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
    }
    return res;
}
  
  public static void main(String[] arg) {

    // test 1
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<Integer> expected_output = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
    List<Integer> output = spiralOrder(matrix);

    if (matrix.equals(output)) {
      System.out.println("Passed 1");
    } else {
      System.out.println("expected:" + expected_output);
      System.out.println("output:" + output);
    }

    // test 2
    int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    expected_output = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    output = spiralOrder(matrix);

    if (matrix2.equals(output)) {
      System.out.println("Passed 1");
    } else {
      System.out.println("expected:" + expected_output);
      System.out.println("output:" + output);
    }

  }
}
