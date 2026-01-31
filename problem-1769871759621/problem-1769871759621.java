// Last updated: 1/31/2026, 8:32:39 PM
1class Solution {
2    public String reverseByType(String s) {
3        int left = 0;
4        int right = s.length()-1;
5        char[] arr = s.toCharArray();
6
7        //for lowercase
8        while(left <= right){
9            char c1 = arr[left];
10            char c2 = arr[right];
11            if((c1 >= 'a' && c1 <= 'z') && c2 >= 'a' && c2 <= 'z'){
12                arr[left] = c2;
13                arr[right] = c1;
14                left++;
15                right--;
16            }
17            else if(!(c1 >= 'a' && c1 <= 'z')){
18                left++;
19            }
20            else{
21                right--;
22            }
23        }
24
25        //for special character
26        int l = 0;
27        int r = s.length()-1;
28        
29        while(l <= r){
30            char c1 = arr[l];
31            char c2 = arr[r];
32            if(!Character.isLetterOrDigit(c1) && !Character.isLetterOrDigit(c2)){
33                arr[l] = c2;
34                arr[r] = c1;
35                l++;
36                r--;
37            }
38            else if(Character.isLetterOrDigit(c1)){
39                l++;
40            }
41            else{
42                r--;
43            }
44        }
45
46        return new String(arr);
47    }
48}