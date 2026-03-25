// Last updated: 3/25/2026, 10:01:43 PM
class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Set<Integer> cancel;
    Set<Integer> activeRider;
    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>(); 
        cancel = new HashSet<>();
        activeRider = new HashSet<>();
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
        activeRider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        int[] r = new int[]{-1,-1};
        while(!rider.isEmpty() && cancel.contains(rider.peek())){
            activeRider.remove(rider.poll());
        }
        if (rider.isEmpty() || driver.isEmpty()) {
            return r;
        }

        int d = driver.poll();
        int rid = rider.poll();
        activeRider.remove(rid);

        r[0] = d;
        r[1] = rid;
        return r;
    }
    
    public void cancelRider(int riderId) {
        if(activeRider.contains(riderId)){
            cancel.add(riderId);
        }
        
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */