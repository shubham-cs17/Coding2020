package testseries.gfg.amazon.strings;

/**
 * @author Shubham Kumar
 * @date 20/4/20
 */
public class ContainsSubsequence {
  public static void main(String[] args) {
    String str ="HelloWorld"; String target  ="HelloWorld";
    System.out.println(strstr( str, target));
  }

  private static int strstr(String str, String target) {
    if(!str.contains(target))
      return -1;
    if(str.equals(target))
      return 0;
    String[] arr = str.split(target);
    return arr[0].length();
  }
}
