// Last updated: 10/2/2025, 12:41:25 PM
import java.util.*;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Boolean res = true;
        for(int i=0; i<bills.length; i++){
            map.put(bills[i] , map.getOrDefault(bills[i],0) + 1);
            if(bills[i] == 10){
                if(map.getOrDefault(5,0) >= 1){
                    map.put(5 , map.get(5) - 1);
                }
                else{
                    res = false;
                    break;
                }
            }
            else if(bills[i] == 20){
                if(map.getOrDefault(10,0) >= 1 && map.getOrDefault(5,0) >= 1){
                    map.put(10 , map.get(10) - 1);
                    map.put(5 , map.get(5) - 1);
                }
                else if(map.getOrDefault(5,0) >= 3){
                    map.put(5 , map.get(5) - 3);
                }
                else{
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
