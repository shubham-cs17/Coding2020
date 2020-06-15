package leetcode.String;

/**
 * @author Shubham Kumar
 * @date 27/2/20
 */
public class FindTheDiff {
  public static void main(String[] args) {
    System.out.println(findTheDifference("abcd","acdeb"));
  }
  public static char findTheDifference(String s, String t) {
    int sSum = 0;
    int tSum = 0;
    for(int i =0 ; i< s.length();i++) {
      sSum = sSum + s.charAt(i);
      tSum = tSum + t.charAt(i);
    }
    tSum = tSum + t.charAt(t.length()-1);
    return (char)(tSum-sSum);
  }
}

