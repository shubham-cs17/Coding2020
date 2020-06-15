package assignment.cashfree;

/**
 * @author Shubham Kumar
 * @date 27/4/20
 */
import java.io.*;
import java.util.*;
public class CashFreeQuarantine
{
  static long Mod = 100000007;
  public long powmod(long a, long b, long c) {
    long ans = 1;
    while(b > 0) {
      if(b% 2 == 1) ans = (ans%c*a%c)%c;
      a = (a%c*a%c)%c;
      b = b>> 1;
    }
    return ans;
  }
  public long modInverse(long n) {
    return powmod(n, Mod-2, Mod);
  }
  public void run() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = ((powmod(n, 3, Mod) + 3 * n + 2)%Mod*1L*modInverse(2))%Mod;
    System.out.println(ans);
  }
  public static void main(String[] args) throws IOException{
    new CashFreeQuarantine().run();
  }
}