class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list= new ArrayList<>();
         int  i=0;
         for(int num=1;num<=n;num++)
         {
                list.add("Push");
            if(num==target[i])
            {
                 i++;
            }else 
            {
                list.add("Pop");
            }
            if(i==target.length)
            {
                break;
            }
         }
         return list;
    }
}