// Last updated: 1/29/2026, 1:38:15 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int n = deck.length;
5        int[] result = new int[n];
6        Deque<Integer> indices = new LinkedList<>();
7        
8        for (int i = 0; i < n; i++) {
9            indices.add(i); 
10        }
11        
12        for (int card : deck) {
13            int idx = indices.poll(); 
14            result[idx] = card;
15            if (!indices.isEmpty()) {
16                indices.add(indices.poll());
17            }
18        }
19        
20        return result;
21    }
22}