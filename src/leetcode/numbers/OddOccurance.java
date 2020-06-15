package leetcode.numbers;

import java.util.*;

/**
 * @author Shubham Kumar
 * @date 27/2/20
 */
public class OddOccurance {
  public static void main(String[] args) {
    System.out.println(singleNumber(new int[]{1,2,2}));
  }
  public static int singleNumber(int[] nums) {
    Set<Integer>  mp = new HashSet<>();
    for(int i = 0;i < nums.length;i++){
      if(mp.contains(nums[i]))
          mp.remove(nums[i]);
      else
        mp.add(nums[i]);
    }
   return mp.iterator().next();
  }
  public static int singleNumber2(int[] nums){
    int result = nums[0];
    if(nums.length>1) {
      for (int i = 1; i < nums.length; i++) {
        result = result ^ nums[i];
      }
    }
    return result;
  }
}
