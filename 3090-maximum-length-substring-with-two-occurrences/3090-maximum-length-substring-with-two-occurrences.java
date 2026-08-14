class Solution {
    public int maximumLengthSubstring(String s) {
        int [] freq=new int[26];
         int front=0;
         int back=0;
         int max=0;
         while(front<s.length())
         {
             freq[s.charAt(front)-'a']++;
            while(freq[s.charAt(front)-'a']>2)
            {
               freq[s.charAt(back)-'a']--;
               back++;

            }
            max=Math.max(max,front-back+1);
            front++;
         }
         return max;
    }
}