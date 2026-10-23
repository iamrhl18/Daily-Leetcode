class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int size = p.length();
        List<Integer> list = new ArrayList<>();
        char[] pp = p.toCharArray();
        Arrays.sort(pp);
        p = new String(pp);
        for(int i=0;i<s.length()-size+1;i++){
            String substring = s.substring(i,i+size);
            char[] kk = substring.toCharArray();
            Arrays.sort(kk);
            substring = new String(kk);
            if(substring.equals(p)){
                list.add(i);
            } 
        }
        return list;
    }
}