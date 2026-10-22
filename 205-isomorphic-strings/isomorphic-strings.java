class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            char val = t.charAt(i);
            if(map.containsKey(key)){
                if(val != map.get(key)) return false;
            }
            else{
                if(mapped.contains(val)) return false;
                map.put(key,val);
                mapped.add(val);
            }
        }
        return true;
    }
}