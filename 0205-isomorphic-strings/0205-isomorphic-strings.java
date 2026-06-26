class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map1=new HashMap<>();
        char[]arr= s.toCharArray();
        char[]arr1= t.toCharArray();
        int l1=arr.length;
        int l2=arr1.length;
        if(l1!=l2)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]) && !map1.containsKey(arr1[i]))
            {
                  map.put(arr[i],arr1[i]);
                  map1.put(arr1[i],arr[i]);
            }
            else{
               
            if(map.getOrDefault(arr[i],'#')!=arr1[i] && map1.getOrDefault(arr1[i],'#')!=arr[i])
               {
                return false;
               }
               }
            
           
        }
        return true;
    }
}