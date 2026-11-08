class Solution {
    public int characterReplacement(String s, int k) {

      int[] freq = new int[26];

      int left = 0;
      int maxFreq = 0;
      int maxLength = 0;

      for(int right = 0; right < s.length(); right++){

        char ch = s.charAt(right);

        freq[ch - 'A']++;

        maxFreq = Math.max(maxFreq, freq[ch - 'A']);

        int windowLength = right - left + 1;

        int replacement = windowLength - maxFreq;

        while(replacement > k){

            freq[s.charAt(left) - 'A']--;

            left++;

            windowLength = right - left + 1;

            replacement = windowLength - maxFreq;
        }

        maxLength = Math.max(maxLength, right - left + 1);
      }  

      return maxLength;
    }
}