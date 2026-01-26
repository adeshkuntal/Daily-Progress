// Last updated: 1/26/2026, 9:51:38 PM
1class Solution {
2    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
3        Arrays.sort(buses);
4        Arrays.sort(passengers);
5
6        Set<Integer> set = new HashSet<>();
7        int ans=0;
8        int j=0;
9        for(int i=0;i<buses.length;i++){
10            int c = 0;
11            while(j<passengers.length && c<capacity && passengers[j]<=buses[i]){
12                if(!set.contains(passengers[j]-1)){
13                    ans=passengers[j]-1;
14                }
15                set.add(passengers[j]);
16                j++; c++;
17            }
18            if(c<capacity && !set.contains(buses[i])){
19                ans = buses[i];
20            }
21        }
22        return ans;
23    }
24}