import java.util.*;

class Solution {
  public void rotate(int[][] matrix) {
    int[][] rotated = new int[matrix.length][matrix.length];

    int x = 0;
    int y = 0;

    int x_rotate = matrix.length - 1;
    int y_rotate = matrix.length - 1;

    while ((x_rotate >= 0) && (y_rotate >= 0)) {
      rotated[y_rotate][x_rotate] = matrix[y][x];

      x++;
      y_rotate++;

      // if hit max length of y, increase x

      if (x > matrix.length) {
        ++y;
        x = 0;

        y_rotate = 0;
        --x_rotate;
      }

    }
    
    matrix = rotated;

  }

  public static void main(String[] arg) {

  }
}
