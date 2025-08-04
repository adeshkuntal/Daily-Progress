// Last updated: 8/4/2025, 6:52:37 PM
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            
            // Process the local name
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replace(".", "");
            uniqueEmails.add(local + "@" + domain);
        }
        
        return uniqueEmails.size();
    }
}