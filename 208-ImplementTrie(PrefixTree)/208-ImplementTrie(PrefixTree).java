// Last updated: 2/4/2026, 12:42:23 PM
1// class Trie {
2
3//     public Trie() {
4        
5//     }
6    
7//     public void insert(String word) {
8        
9//     }
10    
11//     public boolean search(String word) {
12        
13//     }
14    
15//     public boolean startsWith(String prefix) {
16        
17//     }
18// }
19
20/**
21 * Your Trie object will be instantiated and called as such:
22 * Trie obj = new Trie();
23 * obj.insert(word);
24 * boolean param_2 = obj.search(word);
25 * boolean param_3 = obj.startsWith(prefix);
26 */
27
28 public class Trie {
29    class Node {
30        char ch;
31        boolean isTerminal;
32
33        HashMap<Character, Node> child;
34
35        public Node(char ch) {
36            this.ch = ch;
37            child = new HashMap<>();
38        }
39    }
40
41    private Node root;
42
43    public Trie() {
44        root = new Node('*');
45    }
46    public void insert(String word) {
47        Node curr = root;
48
49        for(int i = 0; i < word.length(); i++) {
50            char ch = word.charAt(i);
51            if(curr.child.containsKey(ch)) {
52                curr = curr.child.get(ch);
53
54            }else {
55                Node nn = new Node(ch);
56                curr.child.put(ch, nn);
57                curr = nn;
58            }
59        }
60
61        curr.isTerminal = true;
62    }
63
64    public boolean search(String word) {
65        Node curr = root;
66
67        for(int i = 0; i < word.length(); i++) {
68            char ch = word.charAt(i);
69
70            if(curr.child.containsKey(ch)) {
71                curr = curr.child.get(ch);
72            }else {
73                return false;
74            }
75        }
76
77        return curr.isTerminal;
78    }
79
80    public boolean startsWith(String prefix) {
81        Node curr = root;
82
83        for(int i = 0; i < prefix.length(); i++) {
84            char ch = prefix.charAt(i);
85
86            if(curr.child.containsKey(ch)) {
87                curr = curr.child.get(ch);
88            }else {
89                return false;
90            }
91        }
92
93        return true;
94    }
95}