package testseries.gfg.amazon.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shubham Kumar
 * @date 19/4/20
 */
public class MinmumDistance {
  public static void main(String[] args) {
    long a[] = {1L,2L,3L,2L};
    System.out.println(misDist(a,a.length,1L,5L));
  }

  private static long misDist(long[] a, int n, long x, long y) {
    Map<Long,List<Integer>> map =  new HashMap<>();
    int xIndex = -1;
    int yIndex = -1;
    int distance = Integer.MAX_VALUE;
    for(int i = 0;i<n;i++) {
      if (x == a[i])
        xIndex = i;
      if (y == a[i])
        yIndex = i;
      if (yIndex != -1 && xIndex != -1) {
        int currantDistance = xIndex > yIndex ? xIndex - yIndex : yIndex - xIndex;
        if (currantDistance < distance)
          distance = currantDistance;
      }
    }
    if(Integer.MAX_VALUE!=distance)
      return distance;
    return -1;
  }
}
