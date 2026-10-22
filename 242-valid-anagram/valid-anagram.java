class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character , Integer > map1 = new TreeMap<>();
        for(char ch : s.toCharArray()){
            map1.put(ch , map1.getOrDefault(ch , 0) +1);
        }

        TreeMap<Character , Integer > map2 = new TreeMap<>();
        for(char ch : t.toCharArray()){
            map2.put( ch ,map2.getOrDefault(ch , 0) +1);
        }

        return map1.equals(map2);
    }
}