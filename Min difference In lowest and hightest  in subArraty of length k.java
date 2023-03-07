// Time comp:O(n);
// Space comp:O(1);
  static int diff(int a[],int k,int n)
  {
    int min=a[0],max=a[0];
    int i=0,j=0,res=Integer.MAX_VALUE;
    while(j<n)
    {
        min=Math.min(min,a[j]);
        max=Math.max(max,a[j]);
        if(j-i+1<k)
        j++;
        else if(j-i+1==k)
        {
            res=Math.min(res,max-min);
            i++;
            j++;
            min=a[i];
            max=a[i];
        }
        
    }
    return res;
}

