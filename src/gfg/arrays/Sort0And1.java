package gfg.arrays;

/**
 * @author Shubham Kumar
 * @date 24/2/20
 */
public class Sort0And1 {
  public static void main(String[] args) {
    int a[] = {0,0,0,0,1,1,0,1,1};
    int left =0;
    int right =a.length-1;
    while (left<right){
      while(a[left]==0 && left<right)
        left++;
      while (a[right]==1 && left<right)
        right--;
      if(left<right){
        int temp = a[left];
        a[left] = a[right];
        a[right] =temp;
        left++;
        right--;
      }
    }
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]);
  }
}
