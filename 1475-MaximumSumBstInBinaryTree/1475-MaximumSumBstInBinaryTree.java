// Last updated: 9/4/2025, 7:17:01 PM
class Solution {
    public int maxSumBST(TreeNode root) {
        return validBST(root).ans;
    }

    class BstPair {
        boolean isbst = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ans = 0;
    }

    public BstPair validBST(TreeNode root) {
        if (root == null) {
            return new BstPair();
        }

        BstPair lbp = validBST(root.left);
        BstPair rbp = validBST(root.right);
        BstPair sbp = new BstPair();

        sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
        sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
        sbp.sum = lbp.sum + rbp.sum + root.val;
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;

        if (sbp.isbst) {
            sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
        } else {
            sbp.ans = Math.max(lbp.ans, rbp.ans);
        }

        return sbp;
    }
}
