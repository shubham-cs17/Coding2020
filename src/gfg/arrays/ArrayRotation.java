package gfg.arrays;

import java.util.Scanner;

/**
 * @author Shubham Kumar: https://www.linkedin.com/in/shubham-cs17/
 * @date 8/1/20
 */
public class ArrayRotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      t--;
      int n = sc.nextInt();
      int d = sc.nextInt();
      int[] temp = new int[d];
      for(int i = 0; i<n;i++){
        if(i<d)
          temp[i]=sc.nextInt();
        else
          System.out.print(sc.nextInt()+" ");
      }
      for(int i = 0; i<d; i++)
        System.out.print(temp[i]+" ");
      System.out.println();
    }
  }
}
