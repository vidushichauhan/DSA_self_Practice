class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map1 =  new HashMap<Character, Integer>();
        
        if(s.length()!=t.length()){return false;}

        for(char s1: s.toCharArray()){
            map1.put(s1, map1.getOrDefault(s1, 0) + 1);
        }

        for(char s1: t.toCharArray()){
            if(map1.containsKey(s1) && map1.get(s1)!=0){
                map1.put(s1,map1.get(s1)-1);
            }
            else{
                return false;
            }
        }
return true;
    }
}