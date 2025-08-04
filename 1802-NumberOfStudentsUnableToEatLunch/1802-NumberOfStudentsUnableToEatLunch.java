// Last updated: 8/4/2025, 6:50:17 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         Queue<Integer> queue = new LinkedList<>();
        for (int s : students) {
            queue.add(s);
        }

        int index = 0;
        int count = 0;

        while (!queue.isEmpty() && count < queue.size()) {
            if (queue.peek() == sandwiches[index]) {
                queue.poll();
                index++;
                count = 0;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }

        return queue.size();
    }
}