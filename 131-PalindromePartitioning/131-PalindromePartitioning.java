// Last updated: 10/6/2025, 5:07:33 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> l = new ArrayList<>();
        find_partition(s,res,l);
        return res;
    }
    public static void find_partition(String s, List<List<String>> res, List<String> l){
        if(s.length() == 0){
            res.add(new ArrayList<>(l));
            return;
        }

        for(int i=1; i<=s.length(); i++){
            String x = s.substring(0,i);
            if(ispalindrome(x)){
                l.add(x);
                find_partition(s.substring(i),res,l);
                l.remove(l.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String x){
        int left = 0;
        int right = x.length() - 1;
        while(left <= right){
            if(x.charAt(left) != x.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}