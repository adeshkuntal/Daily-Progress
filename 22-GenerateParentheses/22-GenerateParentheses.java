// Last updated: 8/4/2025, 6:58:33 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        parenthesis(n,0,0,"",ll);
        return ll;
    }
    public static void parenthesis(int n,int closed,int open,String ans,List<String> ll){
        if(open==n && closed == n){
            ll.add(ans);
            return;
        }
        if(open > n || closed > open){
            return;
        }
        parenthesis(n,closed,open+1,ans+"(",ll);
        parenthesis(n,closed+1,open,ans+")",ll);
    } 
    
}