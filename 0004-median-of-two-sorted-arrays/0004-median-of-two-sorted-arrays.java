class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int i=0;int j=0;int k=0;
      double r=0;
      int[] n=new int[nums1.length + nums2.length];
      while(i<nums1.length && j<nums2.length ){
        if(nums1[i]<nums2[j]){
            n[k++]=nums1[i++];

        }else{
            n[k++]=nums2[j++];
        }
      }
      while(i<nums1.length){
        n[k++]=nums1[i++];
      }
      while(j<nums2.length){
        n[k++]=nums2[j++];
      }
     
      if(n.length%2==0){
          
            r=(n[(n.length/2)-1]+n[n.length/2])/2.0;
      }else{
            r=n[n.length/2];
      } 
      return r; 
    }
}