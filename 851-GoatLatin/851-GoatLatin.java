// Last updated: 8/4/2025, 6:53:10 PM
class Solution {
    public String toGoatLatin(String sentence) {
        String final_str = "";
        String[] words = sentence.split(" ");
        String vowels = "AEIOUaeiou";
        int a = 1;
        for (String word : words) {
            if (vowels.indexOf(word.charAt(0)) != -1) {
                final_str+=word+"ma"+"a".repeat(a)+" ";
                a+=1;
            } else if (vowels.indexOf(word.charAt(0)) == -1) {
                final_str+=word.substring(1,word.length())+word.substring(0,1)+"ma"+"a".repeat(a)+" ";
                a+=1;
            }
        }
        String x = final_str.substring(0,final_str.length()-1);
        return x; 
    }
}