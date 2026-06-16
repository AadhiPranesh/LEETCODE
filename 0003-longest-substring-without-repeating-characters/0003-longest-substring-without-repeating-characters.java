class Solution {
    public int lengthOfLongestSubstring(String s) {
     int [] arr=new int[128];
     int left=0;
     int max=0;
     for(int right=0;right<s.length();right++)
     {
        char c=s.charAt(right);
        while(arr[c]==1)
        {
            char leftchar= s.charAt(left);
            arr[leftchar]=0;
            left++;
        }
         arr[c]=1;
        max=Math.max(max,right-left+1);
     }   
      return max;
    }
}