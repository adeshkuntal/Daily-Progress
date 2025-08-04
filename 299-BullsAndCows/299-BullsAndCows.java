// Last updated: 8/4/2025, 6:56:06 PM
class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] secretFreq = new int[10];
        int[] guessFreq = new int[10];

        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bull++;
            } else {
                secretFreq[secret.charAt(i) - '0']++;
                guessFreq[guess.charAt(i) - '0']++;
            }
        }

        for(int i = 0; i < 10; i++) {
            cow += Math.min(secretFreq[i], guessFreq[i]);
        }

        String ans = bull + "A" + cow + "B";

        return ans;
    }
}