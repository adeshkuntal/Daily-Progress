// Last updated: 8/4/2025, 6:57:24 PM
class Solution {
    public List<List<String>> partition(String ques) {
        List<String> l=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partitioning(ques,l,ans);
        return ans;
    }

    public static void partitioning(String ques,List<String> l,List<List<String>> ans) {
        if(ques.length()==0){
            ans.add(new ArrayList(l));
            return;
        }
        for(int cut =1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(ispallendrome(s)){
                l.add(s);
                partitioning(ques.substring(cut),l,ans);
                l.remove(l.size()-1);
            }
        }
    }
    public static boolean ispallendrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}