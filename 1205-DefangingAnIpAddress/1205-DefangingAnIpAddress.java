// Last updated: 8/4/2025, 6:51:54 PM
class Solution {
    public String defangIPaddr(String arr) {
        String str = "";
        for(int i=0; i<arr.length(); i++){
            if(arr.charAt(i)=='.'){
                str+="[";
                str+=arr.charAt(i);
                str+="]";
            }
            else {
                str+=arr.charAt(i);
            }
        
        }
        return str;
    }
}