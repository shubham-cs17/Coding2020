package gfg.arrays;

/**
 * @author Shubham Kumar
 * @date 25/2/20
 */
public class Sort0And1And2 {
  public static void main(String[] args) {
    int a[] = {0,1,0,2,1,1,2,2,0,1,0};
    int low = 0;
    int mid = 0;
    int high = a.length-1;
    int temp;
    while(mid<=high){
      switch (a[mid]){
        case 0:
          temp = a[low];
          a[low]= a[mid];
          a[mid] = temp;
          mid++;
          low++;
          break;
        case 1:
          mid++;
          break;
        case 2:
          temp = a[high];
          a[high] = a[mid];
          a[mid] = temp;
          high --;
          break;
      }
    }
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]);
  }

//  void generate(int  min, int max, int num){
//    if(min <= num && num<=max){
//      return ;
//    }
//    System.out.println(num);
//
//    generate(min,max,(num*10)+(num%10)+1);
//    generate(min,max,(num*10)+(num%10)-1);
//  }
}
