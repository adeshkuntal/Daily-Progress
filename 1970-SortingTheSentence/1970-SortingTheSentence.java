// Last updated: 8/4/2025, 6:49:44 PM
class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            String x = arr[i];
            int a = x.charAt(x.length() - 1) - '0' - 1;
            result[a] = x.substring(0, x.length() - 1);
        };

        String str = String.join(" ", result);
        return str;
    }
}