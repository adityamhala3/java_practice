class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int max_altitude=0;
        for(int i=0;i<gain.length ;i++){
            altitude=altitude+gain[i];
            if(altitude>max_altitude){
                max_altitude=altitude;
            }
        }
        return max_altitude;

    }
}