// Last updated: 8/4/2025, 6:53:40 PM
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                level.add(curr.val);
                if (curr.children != null) {
                    for (Node child : curr.children) {
                        queue.offer(child);
                    }
                }
            }

            result.add(level);
        }

        return result;
    }
}
