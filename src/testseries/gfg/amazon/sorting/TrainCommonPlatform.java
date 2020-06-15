package testseries.gfg.amazon.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shubham Kumar
 * @date 23/4/20
 */
public class TrainCommonPlatform {
  public static void main(String[] args) {
    int arr[] = {};
    int dep[] = {};
    int n  = arr.length;
    System.out.println(findPlatform(arr,dep,n));
  }

  private static int findPlatform(int[] arr, int[] dep, int n) {
    //sort arrays
    for(int i = 0; i<n;i++){
      for(int j = 0; j<n;j++){
        if(arr[i]>arr[j]){
          int  temp1 = arr[i];
          arr[i] = arr[j];
          arr[j] = temp1;
          temp1 = dep[i];
          dep[i] = dep[j];
          dep[j] = temp1;
        }
      }
    }

    //sort ends
    int count = 1;
    int max = 1;
    List<Integer> queued = new ArrayList<>();
    if(n==1)
      return 1;
    for(int i = 1; i<n;i++){
      for(Integer x : queued){
        if(x<arr[i])
          count--;
      }
      if(dep[i-1]<arr[i]){
//        no issues
      }else{
        queued.add(dep[i]);
        count++;
        if(max<count)
        max = count;
      }
    }
    return max;
  }
}
