package testseries.gfg.amazon.arrays;

/**
 * @author Shubham Kumar
 * @date 20/4/20
 */
public class EquilibriumPoint {
  public static void main(String[] args) {
    long a[] = {1,3,5,2,2};
    System.out.println(equilibriumPoint(a,a.length));
  }
  public static int equilibriumPoint(long a[], int n) {
    if(n==1)
      return 1;
    long sum= 0;
    for(int i = 0;i<n;i++)
      sum+=a[i];
    long leftSum = 0;
    for(int i = 0;i<n;i++){
      sum = sum -a[i];
      if(sum == leftSum)
        return i; 
      leftSum = leftSum +a[i];
    }
    return -1;
  }

}
