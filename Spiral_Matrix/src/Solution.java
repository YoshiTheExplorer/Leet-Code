import java.util.*;

class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
      
      List<Integer> output = new ArrayList<>();
      
      int x_max = matrix.length;
      int y_max = matrix[0].length;
      
      int x_min = 0;
      int y_min = 0;
      
      int count = x_max * y_max;
      
      int x = 0;
      int y = 0;
      
      boolean right = true;
      boolean down = false;
      
      for(int i = 0; i < count; i++) {
        
        //hit right, go down by i
        if(x >= x_max-1) {
          --x_max;
          right = false;
          down = true;
        }
        
        //hit bottom, go left by j
        if(y >= y_max-1) {
          --y_max;
          right = true;
          down = true;
        }
        
        //hit left, go up by i
        if(x < x_min) {
          x++;
          ++x_min;
          right = false;
          down = false;
        }
        
        //hit top, go right by i
        if(y < y_min) {
          y++;
          ++y_min;
          right = true;
          down = false;
        }
        
        if(right && !down) {
          //go right
          output.add(matrix[y][x]);
          System.out.println(matrix[y][x]);
          ++x;
          
        } else if(right && down) {
          //go left
          output.add(matrix[y][x]);
          System.out.println(matrix[y][x]);
          --x;
          
        } else if(!right && down) {
          // go down
          output.add(matrix[y][x]);
          System.out.println(matrix[y][x]);
          ++y;
          
        } else if(!right && !down) {
          // go up
          output.add(matrix[y][x]);
          System.out.println(matrix[y][x]);
          --y;
          
        }
        
      }
      
      return output;
    }
    
    public static void main(String[] arg) {
      
      //test 1
      int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      List<Integer> expected_output = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
      List<Integer> output = spiralOrder(matrix);
      
      if(matrix.equals(output)) {
        System.out.println("Passed 1");
      } else {
        System.out.println("expected:" + expected_output);
        System.out.println("output:" + output);
      }
      
      //test 2
      int[][] matrix2 = { 
          {1, 2, 3, 4}, 
          {5, 6, 7, 8}, 
          {9, 10, 11, 12} 
      };

      expected_output = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
      output = spiralOrder(matrix);
      
      if(matrix2.equals(output)) {
        System.out.println("Passed 1");
      } else {
        System.out.println("expected:" + expected_output);
        System.out.println("output:" + output);
      }
      
    }
}