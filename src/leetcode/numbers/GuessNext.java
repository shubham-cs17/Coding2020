package leetcode.numbers;

/**
 * @author Shubham Kumar
 * @date 26/2/20
 */
public class GuessNext {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
  }
  public int guessNumber(int n) {
    long low = 0;
    long high = n+1;
    long mid = (low + high) / 2;
    if(n==Integer.MAX_VALUE)
      return n;
    while (true){
      int guess = 0;
//      int guess = guess(Math.toIntExact(mid)); // this function returns 0,1,-1
//      -1 : My number is lower
//      1 : My number is higher
//      0 : Congrats! You got it!
      if(guess==0)
        return Math.toIntExact(mid);
      else if(guess==1)
        low = mid;
      else
        high = mid;
      mid = (low + high) / 2;
    }
  }
}
