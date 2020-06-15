package testseries.gfg.amazon.strings;

/**
 * @author Shubham Kumar
 * @date 21/4/20
 */
public class ValidateIp {
  public static void main(String[] args) {
    String ip = "0.0.0.0.";
    System.out.println(isValidIP(ip));
  }

  private static boolean isValidIP(String s) {
    if(s.endsWith("."))
      return false;
    String[] strArray = s.split("\\.");
    if(strArray.length!=4)
      return false;
    for(int i = 0;i <4;i++){
      if(strArray[i].length()>1&&strArray[i].charAt(0)=='0')
        return false;
      int num = Integer.parseInt(strArray[i]);
      if(num<0 || num >255)
        return false;
    }
    return true;
  }
}
