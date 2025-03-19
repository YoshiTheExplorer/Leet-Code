import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> listList = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    int num = 0;
    int index;
    
    for(int i = 0; i < strs.length; i++) {
      char[] word = strs[i].toCharArray();
      Arrays.sort(word);
      
      map.getOrDefault(word.toString(), num);
      if(map.get(word.toString()) == null) {
        map.put(word.toString(), num);
        num++;
      }
      
      index = map.get(word);
      listList.add(null);
      
      
      
    }
    
    return listList;
  }
}

/*
 * Given an array of strings strs, group all anagrams together into sublists. You may return the
 * output in any order.
 * 
 * An anagram is a string that contains the exact same characters as another string, but the order
 * of the characters can be different.
 * 
 * Example 1:
 * 
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * 
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]] Example 2:
 * 
 * Input: strs = ["x"]
 * 
 * Output: [["x"]] Example 3:
 * 
 * Input: strs = [""]
 * 
 * Output: [[""]]
 */
