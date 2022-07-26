class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> res= new ArrayList<>();
        int n= num.length;
        int m= n-1;
        
        while(m>=0 || k>0){
            if(m>=0){
                res.add((num[m]+k)%10);
                k=(num[m]+k)/10;
            }
            else{
                res.add(k%10);
                k/=10;
                
            }
            m--;
    
        }
        Collections.reverse(res);
        return res;
    }
}