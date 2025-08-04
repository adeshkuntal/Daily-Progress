// Last updated: 8/4/2025, 6:51:40 PM
class Solution {
    public String reformatDate(String date) {
        String[] part = date.split(" ");
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        String day = part[0].replaceAll("[^0-9]", "");
        String month = part[1];
        String year = part[2];

        int monthNumber = 0;
        for (int i = 0; i < months.length; i++) {
            if (month.equals(months[i])) { 
                monthNumber = i + 1;
                break;
            }
        }

        String formattedMonth = String.format("%02d", monthNumber);
        String formattedDay = String.format("%02d", Integer.parseInt(day));

        return year + "-" + formattedMonth + "-" + formattedDay;
    
    }
}