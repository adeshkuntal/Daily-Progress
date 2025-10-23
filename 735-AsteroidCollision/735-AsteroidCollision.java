// Last updated: 10/23/2025, 12:26:47 PM
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> l = new ArrayList<>();
        for (int a : asteroids){
            l.add(a);
        }

        int i = 1;
        while (i < l.size()) {
            if (l.get(i - 1) > 0 && l.get(i) < 0) {
                if (Math.abs(l.get(i - 1)) > Math.abs(l.get(i))) {
                    l.remove(i);
                } else if (Math.abs(l.get(i - 1)) < Math.abs(l.get(i))) {
                    l.remove(i - 1);
                    i--;
                    if (i < 1){
                        i = 1;
                    }
                } 
                else {
                    l.remove(i);
                    l.remove(i - 1);
                    i--;
                    if (i < 1){
                        i = 1;
                    }
                }
            } 
            else {
                i++;
            }
        }

        int[] res = new int[l.size()];
        for (int j = 0; j < l.size(); j++) res[j] = l.get(j);
        return res;
    }
}
