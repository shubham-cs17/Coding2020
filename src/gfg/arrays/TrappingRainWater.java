package gfg.arrays;

import java.util.Scanner;

/**
 * @author Shubham Kumar
 * @date 9/1/20
 */
public class TrappingRainWater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      t--;
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int[] arr2 = new int[n];
      int[] arr3 = new int[n];
      int count = 0;
      int leftCounter = 0;
      int leftMax = arr[leftCounter];
      int rightCounter = n-1;
      int rightMax = arr[rightCounter];
      while (count < n){
        if(arr[leftCounter]>leftMax)
          leftMax = arr[leftCounter];
        arr2[leftCounter] = leftMax;
        leftCounter++;

        if(arr[rightCounter]>rightMax)
          rightMax = arr[rightCounter];
        arr3[rightCounter] = rightMax;
        rightCounter --;
        count++;
      }
      int[] result = new int[n];
      int sum = 0;
      for(int i = 0; i < n; i++){
        result[i] = Math.min(arr2[i],arr3[i])-arr[i];
        System.out.println(result[i]);
        sum += result[i];
      }
      System.out.println("Result = "+sum);
    }
  }
}
