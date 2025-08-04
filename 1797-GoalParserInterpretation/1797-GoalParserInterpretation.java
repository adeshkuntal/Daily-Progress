// Last updated: 8/4/2025, 6:50:18 PM
class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                ans+=command.charAt(i);
            } else if (command.charAt(i)=='(' && command.charAt(i+1)==')') {
                ans+="o";
            }
            else if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
                ans+= "al";
            }
        }

        
        return ans;
    }
}