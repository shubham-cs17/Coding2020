package leetcode.numbers;

/**
 * @author Shubham Kumar
 * @date 25/2/20
 */
public class MathDotPower {
  public static void main(String[] args) {
    System.out.println(myPow(2.0,-2147483648));
//    int n = -2147483648;
//    System.out.println(n);
  }
  public static double myPow(double x, int n) {

    Long l = Long.valueOf(n);

    if(l<0){
      x = 1/x;
      l= l*-1;
    }
    else if(l ==0){
      x =1;
    }
    double result = 1;
    while (l>1){
      if(l%2 !=0){
        result = result * x;
        l = l-1;
      }
      x = x*x;
      l= l/2;
    }
    return result * x;
  }
}
