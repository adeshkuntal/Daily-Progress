// Last updated: 1/27/2026, 2:35:06 PM
1class MyCircularQueue {
2    int size;
3    ArrayList<Integer> arr;
4    public MyCircularQueue(int k) {
5        size = k;
6        arr = new ArrayList<>();
7    }
8    
9    public boolean enQueue(int value) {
10        if(arr.size() == size){
11            return false;
12        }
13        arr.add(value);
14        return true;
15    }
16    
17    public boolean deQueue() {
18        if(arr.size() == 0){
19            return false;
20        }
21        arr.remove(0);
22        return true;
23    }
24    
25    public int Front() {
26        if(arr.size() == 0){
27            return -1;
28        }
29        return arr.get(0);
30    }
31    
32    public int Rear() {
33        if(arr.size() == 0){
34            return -1;
35        }
36        return arr.get(arr.size()-1);
37    }
38    
39    public boolean isEmpty() {
40        return arr.size() == 0;
41    }
42    
43    public boolean isFull() {
44        return arr.size() == size;
45    }
46}
47
48/**
49 * Your MyCircularQueue object will be instantiated and called as such:
50 * MyCircularQueue obj = new MyCircularQueue(k);
51 * boolean param_1 = obj.enQueue(value);
52 * boolean param_2 = obj.deQueue();
53 * int param_3 = obj.Front();
54 * int param_4 = obj.Rear();
55 * boolean param_5 = obj.isEmpty();
56 * boolean param_6 = obj.isFull();
57 */