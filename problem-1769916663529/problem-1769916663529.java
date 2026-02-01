// Last updated: 2/1/2026, 9:01:03 AM
1class RideSharingSystem {
2    Queue<Integer> rider;
3    Queue<Integer> driver;
4    Set<Integer> cancel;
5    Set<Integer> activeRider;
6    public RideSharingSystem() {
7        rider = new LinkedList<>();
8        driver = new LinkedList<>(); 
9        cancel = new HashSet<>();
10        activeRider = new HashSet<>();
11    }
12    
13    public void addRider(int riderId) {
14        rider.add(riderId);
15        activeRider.add(riderId);
16    }
17    
18    public void addDriver(int driverId) {
19        driver.add(driverId);
20    }
21    
22    public int[] matchDriverWithRider() {
23        int[] r = new int[]{-1,-1};
24        while(!rider.isEmpty() && cancel.contains(rider.peek())){
25            activeRider.remove(rider.poll());
26        }
27        if (rider.isEmpty() || driver.isEmpty()) {
28            return r;
29        }
30
31        int d = driver.poll();
32        int rid = rider.poll();
33        activeRider.remove(rid);
34
35        r[0] = d;
36        r[1] = rid;
37        return r;
38    }
39    
40    public void cancelRider(int riderId) {
41        if(activeRider.contains(riderId)){
42            cancel.add(riderId);
43        }
44        
45    }
46}
47
48/**
49 * Your RideSharingSystem object will be instantiated and called as such:
50 * RideSharingSystem obj = new RideSharingSystem();
51 * obj.addRider(riderId);
52 * obj.addDriver(driverId);
53 * int[] param_3 = obj.matchDriverWithRider();
54 * obj.cancelRider(riderId);
55 */