// Last updated: 10/13/2025, 9:25:09 PM
import java.util.*;

class Solution { 
    public int countArrangement(int n) {
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return find_pre(arr, 0, new ArrayList<>(), new boolean[n]);
    }

    public static int find_pre(int[] arr, int count, List<Integer> temp, boolean[] visited) {
        if (temp.size() == arr.length) {
            for (int i = 0; i < temp.size(); i++) {
                int val = temp.get(i);
                int pos = i + 1;
                if (val % pos != 0 && pos % val != 0) {
                    return count; 
                }
            }
            return count + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int pos = temp.size() + 1;
            int val = arr[i];
            if (val % pos == 0 || pos % val == 0) {
                visited[i] = true;
                temp.add(val);
                count = find_pre(arr, count, temp, visited);
                visited[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
        return count;
    }
}
