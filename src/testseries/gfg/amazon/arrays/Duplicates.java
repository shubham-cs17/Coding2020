package testseries.gfg.amazon.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shubham Kumar
 * @date 20/4/20
 */
public class Duplicates {
  public static void main(String[] args) {
    int a[] = {13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,15,11,19,20,2,4,25,14,23,14};
   printDuplicates(a,a.length);
  }

  private static void printDuplicates(int[] a, int n) {
//    for(int i = 0;i<n;i++){
//      if(a[Math.abs(a[i])]<0)
//        System.out.println((Math.abs(a[i]))+" ");
//      else
//        a[Math.abs(a[i])] = a[Math.abs(a[i])] *-1;
//    }
    int count = 0;
    for(int i = 0;i<n;i++){
      int index = a[i]%n;
      a[index] += n;
    }
    for(int i = 0; i< n;i++){
      if((a[i]/n)>1){
        System.out.print(i + " ");
        count++;
      }
    }
    if(count == 0)
      System.out.println(-1);
  }
}
