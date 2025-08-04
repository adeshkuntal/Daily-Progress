// Last updated: 8/4/2025, 6:51:45 PM

class Solution {
    public int dayOfYear(String date) {
       String[] parts = date.split("-");
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int year = Integer.parseInt(parts[0]);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        
        int n_day = 0;
        for (int i = 0; i < month - 1; i++) {
            n_day += daysInMonth[i];
        }
        
        n_day += day;
        return n_day;
    }
}