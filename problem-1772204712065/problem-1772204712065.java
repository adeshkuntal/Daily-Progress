// Last updated: 2/27/2026, 8:35:12 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length()) return false;
4
5        int[] s1Count = new int[26];
6        int[] s2Count = new int[26];
7        for(int i=0; i<s1.length(); i++){
8            s1Count[s1.charAt(i)-'a']++;
9            s2Count[s2.charAt(i)-'a']++;
10        }
11
12        for(int i=0; i<s2.length()-s1.length(); i++){
13            if (matches(s1Count, s2Count)) return true;
14            s2Count[s2.charAt(i)-'a']--;
15            s2Count[s2.charAt(i+s1.length())-'a']++;
16
17        }
18
19        return matches(s1Count, s2Count);
20    }
21    public static boolean matches(int[] s1Count, int[] s2Count){
22        for(int i=0; i<26; i++){
23            if(s1Count[i] != s2Count[i]){
24                return false;
25            }
26        }
27        return true;
28    }
29}
30
31
32
33
34
35
36
37
38
39
40
41
42
43// class Solution {
44//     public boolean checkInclusion(String s1, String s2) {
45//         char[] arr = s1.toCharArray();
46//         ArrayList<String> res = new ArrayList<>();
47
48//         permu(arr, res, new ArrayList<Character>(), new boolean[arr.length]);
49
50//         for(int i = 0; i < res.size(); i++){
51//             if(s2.contains(res.get(i))){
52//                 return true;
53//             }
54//         }
55//         return false;
56//     }
57
58//     public static void permu(char[] arr, ArrayList<String> res, ArrayList<Character> temp, boolean[] used){
59//         if(temp.size() == arr.length){
60//             String s = "";
61//             for(int i = 0; i < temp.size(); i++){
62//                 s += temp.get(i);
63//             }
64//             res.add(s);
65//             return;
66//         }
67
68//         for(int i = 0; i < arr.length; i++){
69//             if(used[i]) continue;
70
71//             used[i] = true;
72//             temp.add(arr[i]);
73//             permu(arr, res, temp, used);
74//             used[i] = false;
75//             temp.remove(temp.size() - 1);
76//         }
77//     }
78// }