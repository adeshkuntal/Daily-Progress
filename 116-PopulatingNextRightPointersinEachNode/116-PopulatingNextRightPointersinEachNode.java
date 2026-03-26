// Last updated: 3/26/2026, 2:57:41 PM
1class Solution {
2    public Node connect(Node root) {
3        if(root == null) return null;
4
5        Node curr = root;
6
7        while(curr != null){
8            Node dummy = new Node(0);
9            Node tail = dummy;
10
11            while(curr != null){
12                if(curr.left != null){
13                    tail.next = curr.left;
14                    tail = tail.next;
15                }
16
17                if(curr.right != null){
18                    tail.next = curr.right;
19                    tail = tail.next;
20                }
21
22                curr = curr.next;
23            }
24
25            curr = dummy.next;
26        }
27
28        return root;
29    }
30}