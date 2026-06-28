class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for( String a:strs)
        {
            char []arr=a.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(!map.containsKey(str))
            {
              
                map.put(str,new ArrayList<>());
            }
           map.get(str).add(a);
        }
      return new ArrayList<>(map.values());
         
    }
}