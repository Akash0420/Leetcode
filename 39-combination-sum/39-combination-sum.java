class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       /* List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}
}
*/



/*
        if(t == 0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        if(t < 0 || i >= nums.length) return;
        for(int k = i ; k < nums.length; k++){
            cur.add(nums[k]);
            getcomb(nums, k, t-nums[k], cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getcomb(candidates, 0, target, new ArrayList<>(), res);
        return res;
        
*/

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        
        return result;
    }
    
    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
    	if(target > 0){
    		for(int i = start; i < candidates.length && target >= candidates[i]; i++){
    			cur.add(candidates[i]);
    			getResult(result, cur, candidates, target - candidates[i], i);
    			cur.remove(cur.size() - 1);
    		}//for
    	}//if
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
    	}//else if
    }
}