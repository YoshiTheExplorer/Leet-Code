import java.util.*;

class Solution {
  public static int[] topKFrequent(int[] nums, int k) {
    int[] kFrequent = new int[k];
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int num:nums) {
      if(!map.containsValue(num)) {
        map.put(1, num);
      } else {
        map.put(map.get(num) + 1, num);
      }
    }
    
    System.out.println(map);

    return kFrequent;
  }

  public static void main(String[] args) {
    topKFrequent(new int[] {1, 2, 3, 4, 5, 5}, 3);
  }
}

/*
 * Given an integer array nums and an integer k, return the k most frequent elements within the
 * array.
 * 
 * The test cases are generated such that the answer is always unique.
 * 
 * You may return the output in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,2,3,3,3], k = 2
 * 
 * Output: [2,3] Example 2:
 * 
 * Input: nums = [7,7], k = 1
 * 
 * Output: [7]
 */
