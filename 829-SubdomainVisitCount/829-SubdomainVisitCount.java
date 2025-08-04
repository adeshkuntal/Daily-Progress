// Last updated: 8/4/2025, 6:53:15 PM
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String entry : cpdomains) {
            String[] parts = entry.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];
            String[] fragments = domain.split("\\.");
            
            for (int i = 0; i < fragments.length; i++) {
                String subdomain = String.join(".", Arrays.copyOfRange(fragments, i, fragments.length));
                map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            result.add(e.getValue() + " " + e.getKey());
        }

        return result;
    }
}
