package leetcode.numbers;

import java.util.Arrays;

/**
 * @author Shubham Kumar
 * @date 07/06/20
 */
public class MissingNumberV2 {
  public static void main(String[] args) {
//    System.out.println(missingNumberV2(new int[]{1,2,3,4,4,5}));
    System.out.println(missingNumberV2(new int[]{1,2,3,7,4,5}));
  }

  private static int missingNumberV2(int[] arr) {
    Arrays.sort(arr);
    int l = arr.length;
    int sum = l*(l+1)/2;
    int factor = 0;
    for(int i = 1;i<=l;i++){
      if(arr[i-1]==i-factor){
        sum = sum - arr[i-1];
      }else{
        factor = factor +1;
      }
    }
    return sum;
  }
}
