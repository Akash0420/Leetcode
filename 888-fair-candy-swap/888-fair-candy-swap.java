/*class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum_a=0,sum_b=0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            sum_a+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)
        {
            sum_b+=bobSizes[i];
        }
        int target=(sum_a-sum_b)/2;
        int[] res=new int[2];
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                if(aliceSizes[i]==bobSizes[j]+target)
                {
                    res[0]=aliceSizes[i];
                    res[1]=bobSizes[j];
                }
            }
        }
        return res;
    }
}*/

class Solution {
    
    private int binarySearch(int[] arr,int target){ 
        int s=0,e = arr.length-1;
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
            
        }
        return -1;
    }
    
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) { //a = Alice , b=Bob
        int suma=0,sumb=0;
        for(int i=0;i<aliceSizes.length;i++)
            suma+=aliceSizes[i];
        for(int i=0;i<bobSizes.length;i++)
            sumb+=bobSizes[i];
        
        int diff = (suma-sumb)/2;
        
        Arrays.sort(aliceSizes);
        for(int num:bobSizes){
            if (binarySearch(aliceSizes,num+diff) !=-1) return new int[]{num+diff,num};
        }
        
        return null;
        
    }
}