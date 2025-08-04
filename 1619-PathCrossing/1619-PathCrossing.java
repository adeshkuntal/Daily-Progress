// Last updated: 8/4/2025, 6:50:56 PM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        boolean ans = false;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'N') {
                y += 1;
            } else if(path.charAt(i) == 'S') {
                y -= 1;
            } else if(path.charAt(i) == 'E') {
                x += 1;
            } else if(path.charAt(i) == 'W') {
                x -= 1;
            }

            String pos = x + "," + y;
            if(visited.contains(pos)) {
                ans = true;
                break;
            } else {
                visited.add(pos);
            }
        }

        return ans;
    }
}
