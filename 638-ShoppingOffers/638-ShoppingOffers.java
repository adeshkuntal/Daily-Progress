// Last updated: 8/4/2025, 6:54:22 PM
class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs, new HashMap<>());
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> memo) {
        if (memo.containsKey(needs)) {
            return memo.get(needs);
        }

        // Calculate the cost without using any special offer
        int total = 0;
        for (int i = 0; i < price.size(); i++) {
            total += price.get(i) * needs.get(i);
        }

       
        for (List<Integer> offer : special) {
            List<Integer> remainingNeeds = new ArrayList<>();
            boolean isValid = true;
            for (int i = 0; i < price.size(); i++) {
                int remaining = needs.get(i) - offer.get(i);
                if (remaining < 0) {
                    isValid = false;
                    break;
                }
                remainingNeeds.add(remaining);
            }

            if (isValid) {
                int offerPrice = offer.get(offer.size() - 1);
                total = Math.min(total, offerPrice + dfs(price, special, remainingNeeds, memo));
            }
        }

        memo.put(needs, total);
        return total;
    }
}
