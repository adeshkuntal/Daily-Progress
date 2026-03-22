// Last updated: 3/22/2026, 1:30:54 PM
1import java.util.*;
2
3class MinStack {
4    Stack<Integer> st;
5    PriorityQueue<Integer> pq;
6
7    public MinStack() {
8        st = new Stack<>();
9        pq = new PriorityQueue<>();
10    }
11    
12    public void push(int val) {
13        st.push(val);
14        pq.add(val);   
15    }
16    
17    public void pop() {
18        int x = st.pop();   
19        pq.remove(x);       
20    }
21    
22    public int top() {
23        return st.peek();   
24    }
25    
26    public int getMin() {
27        return pq.peek();
28    }
29}