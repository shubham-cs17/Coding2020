package gfg.arrays;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Shubham Kumar: https://www.linkedin.com/in/shubham-cs17/
 * @date 7/1/20
 * @Ques : Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.
 * @Complexity : O(m+n)
 */
public class Union {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t>0){
      t--;
      HashSet<Integer> set = new HashSet<>();
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i =0 ; i<n;i++)
        set.add(sc.nextInt());
      for(int i =0 ; i<m;i++)
        set.add(sc.nextInt());
      System.out.println(set.size());
    }
  }
}
