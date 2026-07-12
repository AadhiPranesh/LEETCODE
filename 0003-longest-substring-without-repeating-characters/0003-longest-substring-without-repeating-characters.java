class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] arr=new int[128];
        int right=0;
        int left=0;
        int  max=0;//max means count of sub string with non repeating character
        if(s.length()==0)
        {
            return 0;
        }
        while(right<s.length())
        {
        char c=s.charAt(right);
        while(arr[c]==1)
        {
             char c1= s.charAt(left);
             arr[c1]=0;
            
            left++;
        }
        
        arr[c]=1;
        max=Math.max(max,right-left);
          right++;
        }
        return max+1;

    }
}