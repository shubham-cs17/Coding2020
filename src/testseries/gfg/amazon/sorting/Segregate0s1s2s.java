package testseries.gfg.amazon.sorting;

/**
 * @author Shubham Kumar
 * @date 22/4/20
 */
public class Segregate0s1s2s {
  public static void main(String[] args) {
    int[] a = {2, 2, 0, 0, 2, 1, 0, 1, 1, 2, 2, 1, 2, 2, 0};
    sort012(a,a.length);
  }

  private static void sort012(int[] a, int n) {
    try {
      int left = 0, mid = 0, right = n - 1;
      while (mid <= right) {
        if (a[mid] == 0) {
          int temp = a[mid];
          a[mid] = a[left];
          a[left] = temp;
          mid++;
          left++;
        }
        else if (a[mid] == 1) {
          mid++;
        }
        else if (a[mid] == 2) {
          int temp = a[mid];
          a[mid] = a[right];
          a[right] = temp;
          right--;
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException e){
      return;
    }
    for(int i = 0; i<n; i++){
      System.out.print(a[i]);
    }
  }
}
