// Last updated: 8/4/2025, 6:51:38 PM
import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString().substring(0,1) + dayOfWeek.toString().substring(1).toLowerCase();
    }
}