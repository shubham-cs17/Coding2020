package leetcode.numbers;

/**
 * @author Shubham Kumar
 * @date 25/3/20
 * @Question : https://leetcode.com/problems/non-decreasing-array/
 */
public class NonDecreasingArray {
  public static void main(String[] args) {
    int[] a= new int[]{1,3,5,2,4};
    System.out.println(checkPossibility(a));
  }
  public static boolean checkPossibility(int[] a) {
    int n = 0;
    if(a.length==1)
      return true;
    int min  = a[0]<a[1]?a[0]:a[1];
    int max = a[0];
    for (int i = 0; i< a.length-1;i++){
      if(a[i]>a[i+1]) {
        n++;
      }
      if(a[i]<min)
        n++;
      if(a[i]>max){
        n++;
        max = a[i];
      }
      if(n>1)
        return false;
    }
    return true;
  }
}
