package hackerearth;

/**
 * @author Shubham Kumar
 * @date 12/2/20
 */
public class MinBribes {
  public static void main(String[] args) {
    int q[] = {1, 2, 5, 3, 4, 7, 8, 6};
    int bribe = 0;
    boolean chaotic = false;
    for (int i = 0; i < q.length; i++) {
      if (q[i] - (i + 1) > 2) {
        chaotic = true;
        break;
      }
      for (int j = Math.max(0, q[i] - 2); j < i; j++)
        if (q[j] > q[i])
          bribe++;
    }
    if (chaotic)
      System.out.println("Too chaotic");
    else
      System.out.println(bribe);
  }
}
