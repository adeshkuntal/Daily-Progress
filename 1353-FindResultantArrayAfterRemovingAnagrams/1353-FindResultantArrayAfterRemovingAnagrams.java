// Last updated: 8/4/2025, 6:51:28 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ll = new ArrayList<>(Arrays.asList(words));
        for(int i=0; i<ll.size()-1; i++){
            if(isAnagram(ll.get(i), ll.get(i+1))){
                ll.remove(i+1);
                i--; 
            }
        }
        return ll;
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}