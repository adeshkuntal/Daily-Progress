// Last updated: 3/20/2026, 5:22:25 PM
1class MyQueue {
2    Stack<Integer> s1;
3    Stack<Integer> s2;
4
5    public MyQueue() {
6        s1 = new Stack<>();
7        s2 = new Stack<>();
8    }
9    
10    public void push(int x) {
11        while(!s1.isEmpty()){
12            s2.add(s1.pop());
13        }
14        s1.add(x);
15        while(!s2.isEmpty()){
16            s1.add(s2.pop());
17        }
18    }
19    
20    public int pop() {
21        return s1.pop();
22    }
23    
24    public int peek() {
25        return s1.peek();
26    }
27    
28    public boolean empty() {
29        return s1.isEmpty();
30    }
31}
32
33/**
34 * Your MyQueue object will be instantiated and called as such:
35 * MyQueue obj = new MyQueue();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.peek();
39 * boolean param_4 = obj.empty();
40 */