class Solution {
    public int maxArea(int[] height) {
   int i=0;
   int j=height.length-1;
   int max=0;
   int m=1;
        while(i<j){
        m=(j-i)*Math.min(height[i],height[j]);
        if(m>max){
            max=m;
        }
        if(height[i]<=height[j]){
            i++;
        }else{
            j--;
        }
        }

return max;

      }
}