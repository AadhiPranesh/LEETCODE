class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1])); // Sort by end
 // 1. Sort balloons by their ending position
        int  arrowcount =1;  // First arrow
        // 2. First arrow is needed for the first balloon
        // 3. Shoot the first arrow at the end of the first balloon
        int arrPos=points[0][1];// Shoot at first end
                // 4. Check remaining balloons

        for(int i=1;i<points.length;i++)
        {

            // If current balloon starts after arrow position,
            // current arrow cannot burst it
            if(points[i][0]>arrPos)
            {
                arrowcount++;
                arrPos=points[i][1];
            }
        }
        return arrowcount;
    }
}