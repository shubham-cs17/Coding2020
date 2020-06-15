package gfg.string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Shubham Kumar: https://www.linkedin.com/in/shubham-cs17/
 * @date 7/1/20
 * @Ques : Given two strings s1 and s2, remove those characters from first string which are present in second string. Both the strings are different and contain only lowercase characters.
 * @Complexity : O(n)
 */
public class RemoveChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while (n>0){
      n--;
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      HashMap<Character, Integer> frequencyMap = new HashMap<>();
      for(int i = 0; i<s2.length();i++){
        if(frequencyMap.containsKey(s2.charAt(i)))
          frequencyMap.put(s2.charAt(i),frequencyMap.get(s2.charAt(i))+1);
        else
          frequencyMap.put(s2.charAt(i),1);
      }

      //if need to adhere to number of occurance of each char
    /*  for(int i = 0; i<s1.length();i++){
        char c = s1.charAt(i);
        if(frequencyMap.containsKey(c)&&frequencyMap.get(c)>0)
          frequencyMap.put(c,frequencyMap.get(c)-1);
        else
          System.out.print(c);
      }*/

      for(int i = 0; i<s1.length();i++){
        char c = s1.charAt(i);
        if(!frequencyMap.containsKey(c))
          System.out.print(c);
      }
      System.out.println();
    }
  }
}
