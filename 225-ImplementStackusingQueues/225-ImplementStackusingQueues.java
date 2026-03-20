// Last updated: 3/20/2026, 5:15:26 PM
1class MyStack {
2    Queue<Integer> q1;
3    Queue<Integer> q2;
4
5    public MyStack() {
6        q1 = new LinkedList<>();
7        q2 = new LinkedList<>();
8    }
9
10    public void push(int x) {
11        while (!q1.isEmpty()) {
12            q2.add(q1.poll());
13        }
14        q1.offer(x);
15        while (!q2.isEmpty()) {
16            q1.add(q2.poll());
17        }
18    }
19
20    public int pop() {
21        return q1.poll();
22    }
23
24    public int top() {
25        return q1.peek();
26    }
27
28    public boolean empty() {
29        return q1.isEmpty();
30    }
31}