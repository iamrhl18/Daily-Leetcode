class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        Set<String> mapped = new HashSet<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;

        for(int i=0;i<pattern.length();i++){
            char key = pattern.charAt(i);
            String val  = str[i];
            if(map.containsKey(key)){
                if(!map.get(key).equals(val)) return false;
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