package testseries.gfg.amazon.arrays;

/**
 * @author Shubham Kumar
 * @date 19/4/20
 */
public class ThirdLargest {
  public static void main(String[] args) {
    Long a[] = {40L, 64L, 71L, 88L};
    System.out.println(thrdLargest(a));
  }

  private static long thrdLargest(Long[] a) {
    if(a.length<3) {
      return -1L;
    }
    long third=a[1]<a[0]?a[1]:a[0];
    long second=a[1]>a[0]?a[1]:a[0];
    long first;
    if(a[2]>second){
      first = a[2];
    }else{
      first = second;
      second = a[2]>third?a[2]:third;
      third = a[2]<third?a[2]:third;
    }
    for(int j = 3 ;j<a.length;j++){
      int count =  0;
      if(a[j]>third){
        count++;
      }
      if(a[j]>second){
        count++;
      }
      if(a[j]>first){
        count++;
      }
      if(count==1)
        third = a[j];
      else if(count==2) {
        third = second;
        second = a[j];
      }else if(count==3){
        third = second;
        second =first;
        first = a[j];
      }
    }
    return third;
  }
}
