package leetcode.numbers;

/**
 * @author Shubham Kumar
 * @date 27/2/20
 */
public class MissingNumber {
  public static void main(String[] args) {
    System.out.println(new int[]{0,1,2,4});
  }
  public static int missingNumber(int[] nums) {
    int l = nums.length;
    int formulaSum = l*(l+1)/2;
    int sum = 0;
    for(int i = 0; i<l;i++)
      sum +=  nums[i];
    return formulaSum-sum;
  }
}
