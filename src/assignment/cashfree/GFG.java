//package assignment.cashfree;
//
//import java.util.Scanner;
//
///**
// * @author Shubham Kumar
// * @date 27/4/20
// */
//
//class CashFreeQuarantine {
//
//  static int nCr(int n, int r)
//  {
//    return factorial(n) / (factorial(r) *
//        factorial(n - r));
//  }
//
//  static int factorial(int n)
//  {
//    int res = 1;
//    for (int i = 2; i <= n; i++)
//      res = res * i;
//    return res;
//  }
//
//  public static void main(String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    if(n==0)
//    long soln = nCr(n,0)+nCr(n,1)+nCr(n,2)
//        +n*(nCr(n-1,0)+nCr(n-1,1)+nCr(n-1,2));
//    System.out.println(soln);
//  }
//}
