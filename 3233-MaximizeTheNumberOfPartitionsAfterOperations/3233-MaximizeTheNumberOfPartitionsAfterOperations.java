// Last updated: 11/22/2025, 1:17:29 PM
class Solution {
    String s;
    int k;
    Map<String,Integer> memo;

    private int dfs(int idx, int mask, boolean canChange){
        if(idx == s.length()) return 0;
        String key = idx + "#" + mask + "#" + canChange;
        if(memo.containsKey(key)) return memo.get(key);

        int curChar = s.charAt(idx) - 'a';
        int newMask = mask | (1 << curChar);
        int res;
        if(Integer.bitCount(newMask) > k)
            res = 1 + dfs(idx+1, 1 << curChar, canChange);
        else
            res = dfs(idx+1, newMask, canChange);

        if(canChange){
            for(int c=0;c<26;c++){
                if(c==curChar) continue;
                int mask2 = mask | (1<<c);
                if(Integer.bitCount(mask2) > k)
                    res = Math.max(res, 1 + dfs(idx+1, 1<<c, false));
                else
                    res = Math.max(res, dfs(idx+1, mask2, false));
            }
        }
        memo.put(key,res);
        return res;
    }

    public int maxPartitionsAfterOperations(String _s, int _k){
        s = _s; k=_k;
        memo = new HashMap<>();
        return dfs(0,0,true)+1;
    }
}