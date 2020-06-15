package testseries.gfg.amazon.sorting;

/**
 * @author Shubham Kumar
 * @date 24/4/20
 */
public class Segregate0s1s {
  public static void main(String[] args) {
    int[] a = {1 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,1};
    sort01(a, a.length);
  }

  private static void sort01(int[] arr, int n) {
    int left = 0,
        right = n-1,
        mid = 0;
    while(mid<right){
      if(arr[mid] == 0){

        int temp = arr[mid];
        arr[mid] = arr[left];
        arr[left] = temp;
        left ++;
        mid++;
      }
      if(arr[mid]==1){
        if(arr[right]==1){
          right--;
        }else {
          int temp = arr[mid];
          arr[mid] = arr[right];
          arr[right] = temp;
          right--;
          mid++;
        }
      }
    }
    for(int i = 0; i< n ; i++)
      System.out.print(arr[i]);
  }
}
