package testseries.gfg.amazon.strings;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 21/4/20
 * @Question : https://practice.geeksforgeeks.org/problems/match-specific-pattern/1/?track=amazon-strings&batchId=192
 */
public class MatchSpecificPattern {
  public static void main(String[] args) {
    String pattern = "ffoo";
    ArrayList<String> input = new ArrayList<>();
    input.add("abc");
    input.add("aabb");
    input.add("xyz");
    input.add("xyy");
    ArrayList<String> output = findMatchedWords(input, pattern);
    output.stream().forEach(x-> System.out.println(x));

  }
  public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern){
    ArrayList<String> result = new ArrayList<>();
    String toCheckPattern = getPattern(pattern);
    for(String s : dict){
      if(toCheckPattern.equals(getPattern(s)))
        result.add(s);
    }
    return result;
  }
  static String getPattern(String p){
    String s = String.valueOf(0);
    for (int i = 1; i < p.length(); i++) {
      if (p.charAt(i) == p.charAt(i - 1))
        s +=s.charAt(i - 1);
      else
        s += i;
    }
    return s;
  }
}
