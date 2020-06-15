package gfg.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shubham Kumar: https://www.linkedin.com/in/shubham-cs17/
 * @date 8/1/20
 * @Ques : Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
 *
 */
public class KthSmallest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0) {
      t--;
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0;i<n;i++)
        arr[i]= sc.nextInt();
      int k = sc.nextInt();
      Arrays.sort(arr);
      System.out.println(arr[k-1]);
    }
  }
}
