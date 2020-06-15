package leetcode.numbers;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 25/2/20
 */
public class MathDotSqrt {
  public static void main(String[] args) {
    System.out.println(mySqrt(2147483647));
  }

  public static int mySqrt(int n) {
    if(n==1||n==0)
      return n;
    int low =0;
    int high = n;
    int mid = (low +high)/2;
    Map mp = new HashMap<Integer, Integer>();
    while(mid !=low){
      System.out.println(mid);
      BigInteger val = BigInteger.valueOf((mid * mid));
      if(val.intValueExact()==n)
        return mid;
      else if(val.intValueExact() < n)
        low = mid;
      else
        high = mid;
      mid = (low+high)/2;
    }
    return low;
  }

}
