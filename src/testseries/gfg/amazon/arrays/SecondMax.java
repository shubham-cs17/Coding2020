package testseries.gfg.amazon.arrays;

/**
 * @author Shubham Kumar
 * @date 19/4/20
 */
public class SecondMax {
  public static void main(String[] args) {
    int arr[] = {1000, 1000, 1000, 1000, 1000, 100};
    largestAndSecondLargest(arr.length,arr);
  }

  private static void largestAndSecondLargest(int length, int[] arr) {
    int max = arr[0];
    int max2 = -1;
    if(arr[1]<max)
      max2 = arr[1];
    else if (arr[1]>max){
      max2 = max;
      max = arr[1];
    }
    for(int i = 2;i<length;i++){
//      if(arr[i]==max){
//        max2 = max;
//      }
       if(arr[i]>max){
        max2 = max;
        max = arr[i];
      }else if(arr[i]>max2 && arr[i]!=max)
        max2 = arr[i];
    }
    System.out.println(max + " " + max2);
  }
}
