class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map=new HashMap<>();
     HashMap<String,Character> map1=new HashMap<>();
     int l=pattern.length();
     int l1=0;
    String []str= s.split(" ");
    l1=str.length;
     if(l1!=l)
     {
        return false;
     }
     for(int i=0;i<l;i++)
     {
        if(!map.containsKey(pattern.charAt(i)) && !map1.containsKey(str[i])){
            map.put(pattern.charAt(i),str[i]);
            map1.put(str[i],pattern.charAt(i));
        }
        else{
            if(map.getOrDefault(pattern.charAt(i),"#")!=str[i]  && map1.getOrDefault(str[i],'#')!=pattern.charAt(i)){
                return false;
            }
        }


     }
return true;
    }
}