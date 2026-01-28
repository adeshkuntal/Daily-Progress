// Last updated: 1/28/2026, 9:27:08 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        Queue<Integer> q=new LinkedList<>();
4        for(int i=1;i<=n;i++){
5            q.add(i);
6        }
7        int count=1;
8        while(q.size()>1){
9            int rv=q.remove();
10            if(count==k){
11                count=0;
12            }
13            else{
14                q.add(rv);
15            }
16            count++;
17        }
18        return q.remove();
19    }
20}