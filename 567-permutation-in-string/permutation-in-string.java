class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        // Creating the freq array to count the frequencies of characres \
        int[] freq = new int[26];

        // NOw store the freq of s1 string 
        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }

        int[] freq2 = new int[26];

        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;

        }
        if(Arrays.equals(freq,freq2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(freq,freq2)) return true;
        }
        return false;

    }
}