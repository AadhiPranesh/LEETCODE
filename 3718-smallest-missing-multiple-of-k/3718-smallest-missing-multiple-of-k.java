class Solution {
    public int missingMultiple(int[] arr, int k) {
      
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
        for(int i=1;i<10000;i++)
        {
            if(!map.containsKey(i*k)){
                return i*k;
            }
        }
        return -1;
    }
}