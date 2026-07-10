class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freg=new int [26];
        for( char t: tasks)
        {
            freg[t-'A']++;
        }
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int f:freg)
        {
            if(f>0){
            maxheap.offer(f);
        }}
        Queue<int []> queue=new LinkedList<>();
        int time=0;
        while(!maxheap.isEmpty()|| !queue.isEmpty())
        
        {
            time++;
            if(!maxheap.isEmpty())
            {
                int current=maxheap.poll();
                current--;
                if (current > 0) {
                    queue.offer(new int[]{current, time + n});
                }
            }
            if(!queue.isEmpty() && queue.peek()[1]==time )
            { 
                 maxheap.offer(queue.poll()[0]);
            }
        }

return time;
    }
}