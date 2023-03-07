// tc:O(n)
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> a,int n){
       long max=Long.MIN_VALUE;
      int i=0,j=0;
      long sum=0;
      while(j<n)
      {
          sum+=a.get(j);
          if(j-i+1<k)
          {
              j++;
          }
          else if(j-i+1==k)
          {
              max=Math.max(sum,max);
              sum-=a.get(i);
              i++;
              j++;
          }
      }
      return max;
    }
   
}
