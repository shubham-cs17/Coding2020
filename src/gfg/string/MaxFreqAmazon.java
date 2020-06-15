package gfg.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 31/5/20
 */
public class MaxFreqAmazon {
  public static void main(String[] args) {
    String str = "Nilesh is is is is is a bloody bloody tester tester";
    str =str.toLowerCase();
    List<String> forbiddenList = new ArrayList<>();
    forbiddenList.add("is");
    Map<String, Integer> freqMap = new HashMap<>();
    String[] strArr = str.split(" ");
    int max = 1;
    for(int i = 0; i < strArr.length; i++){
      if(forbiddenList.contains(strArr[i]))
        continue;
      else{
        if(freqMap.containsKey(strArr[i])) {
          freqMap.put(strArr[i], freqMap.get(strArr[i]) + 1);
          if(freqMap.get(strArr[i])>max)
            max = freqMap.get(strArr[i]);
        }
        else
          freqMap.put(strArr[i],1);
      }
    }
    for(Map.Entry<String, Integer> entry : freqMap.entrySet()){
      if(entry.getValue() == max)
        System.out.println(entry.getKey());
    }
  }
}
