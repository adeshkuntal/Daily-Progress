// Last updated: 8/4/2025, 6:54:01 PM
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.id == id) {
                int total = e.importance;
                for (int j = 0; j < e.subordinates.size(); j++) {
                    total += getImportance(employees, e.subordinates.get(j));
                }
                return total;
            }
        }
        return 0;
    }
}
