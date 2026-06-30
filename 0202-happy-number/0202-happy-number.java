class Solution {
     private int formula(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int f=n%10;
            sum+=f*f;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet <Integer> set =new HashSet<>();
       while(n!=1){
     if(set.contains(n))
        {
            return  false;
        }
      
            set.add(n);
   n=formula(n);
       }
        return true;
    }
  
}