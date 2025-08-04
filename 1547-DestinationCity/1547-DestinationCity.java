// Last updated: 8/4/2025, 6:51:10 PM
class Solution { 
    public String destCity(List<List<String>> paths) {
        String ans = "";
        for(int i = 0; i < paths.size(); i++) {
            boolean isDestination = true;
            for(int k = 0; k < paths.size(); k++) {
                if(paths.get(i).get(1).equals(paths.get(k).get(0)) && k != i) {
                    isDestination = false;
                    break;
                }
            }
            if(isDestination) {
                ans = paths.get(i).get(1);
                break;
            }
        }
        return ans;
    }
}
