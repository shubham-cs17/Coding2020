package dp;

/**
 * @author Shubham Kumar
 * @date 26/4/20
 */
public class HouseRobber {
  public static void main(String[] args) {
    int arr[] ={1,2,3,1};
    System.out.println(rob(arr));
  }
  public static int rob(int[] nums) {
    int dp[] = new int[nums.length];
    if(nums.length==0)
      return 0;
    if(nums.length==1)
      return nums[0];
    if(nums.length==2){
      return nums[0]>nums[1]?nums[0]:nums[1];
    }
    dp[0]= nums[0];
    dp[1]= nums[0]>nums[1]?nums[0]:nums[1];
    for(int i = 2;i<nums.length;i++)
    {
      dp[i] = dp[i-1]>(nums[i]+dp[i-2])?dp[i-1]:nums[i]+dp[i-2];
      System.out.println(i+"  "+dp[i]);
    }
    return dp[nums.length-1];
  }
}
