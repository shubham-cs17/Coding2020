package leetcode.numbers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 26/2/20
 */
public class HappyNumber {
  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }
  public static boolean isHappy(int n) {
    int sum = 0;
    Map mp = new HashMap<Integer, Integer>();
    do{
      while(n!=0){
        sum = sum + (n%10)*(n%10);
        n = n/10;
      }
      if(mp.containsKey(sum))
        return false;
      mp.put(sum,0);
      n = sum;
      sum = 0;
    }while(n!=1);
    return true;
  }
}
