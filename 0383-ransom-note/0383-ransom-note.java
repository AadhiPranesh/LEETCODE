class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
       char []arr= ransomNote.toCharArray();
        char []arr1= magazine.toCharArray();
                HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         for(int i=0;i<arr1.length;i++)
        {
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
        }
         for(int i=0;i<arr.length;i++)
         {
            if(map1.containsKey(arr[i]) && map1.get(arr[i])>0)
            {
               map1.put(arr[i],map1.getOrDefault(arr[i],0)-1);
            }
            else{
                return false;
            }
         }
          return true;
    }
}