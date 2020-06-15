package gfg.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 8/1/20
 */
public class UnionStream {
  public static void main (String[] args) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    while(n>0){
      n--;
      int output = 0;
      Map<String, Integer> map = new HashMap<>();
      Arrays.stream(reader.readLine().split("\\s"));
      Arrays.stream(reader.readLine().split("\\s")).forEach(i->map.put(i,0));
      Arrays.stream(reader.readLine().split("\\s")).forEach(i->map.put(i,0));
      System.out.println(map.size());
    }
  }
}
