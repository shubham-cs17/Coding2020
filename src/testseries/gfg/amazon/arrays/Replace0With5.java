package testseries.gfg.amazon.arrays;

/**
 * @author Shubham Kumar
 * @date 19/4/20
 */
public class Replace0With5 {
  public static void main(String[] args) {
    int num = 1001;
    System.out.println(convertfive(num));
  }

  static int convertfive(int num) {
    char[] arr = String.valueOf(num).toCharArray();
    for(int i=0; i<arr.length;i++) {
      if (arr[i] == '0')
        arr[i] = '5';
    }
      return Integer.parseInt(String.valueOf(arr));

    }
}
