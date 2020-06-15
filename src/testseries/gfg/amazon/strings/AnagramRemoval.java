package testseries.gfg.amazon.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 20/4/20
 */
public class AnagramRemoval {
  public static void main(String[] args) {
    String s = "basgadhbfgvhads";
    String s1 = "sjdhgvbjdsbhvbvd";
    System.out.println(remAnagrams(s,s1));
  }

  private static int remAnagrams(String s, String s1) {
    Map<Character,Integer> freqMap =  new HashMap<>();
    for(int i = 0; i<s.length();i++){
      char c = s.charAt(i);
      if(freqMap.containsKey(c))
        freqMap.put(c,freqMap.get(c)+1);
      else
        freqMap.put(c,1);
    }
    for(int i=0;i<s1.length();i++){
      char c = s1.charAt(i);
      if(freqMap.containsKey(c))
        freqMap.put(c,freqMap.get(c)-1);
      else
        freqMap.put(c,-1);
    }
    int count = 0;
    for(int c : freqMap.values())
      count+= Math.abs(c);
    return count;
  }
}
