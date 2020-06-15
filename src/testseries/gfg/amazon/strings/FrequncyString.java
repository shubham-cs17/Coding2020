package testseries.gfg.amazon.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 20/4/20
 */
public class FrequncyString {
  public static void main(String[] args) {
    String s = "wwwwaaadexxxxxx";
    System.out.println(frequency(s));
  }

  private static String frequency(String s) {
    List<String> encodeList = new ArrayList<>();
    int current = 0;
    int count = 1;
    while(current<s.length()-1){
      if(s.charAt(current)!=s.charAt(current+1)){
        encodeList.add(s.charAt(current)+String.valueOf(count));
        count= 1;
      }else{
        count++;
      }
      current++;
    }
    encodeList.add(s.charAt(current)+String.valueOf(count));
    return String.valueOf(encodeList).replace(", ","").replace("[","").replace("]","");
  }
}
