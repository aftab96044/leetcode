class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<=nums.length-1; i++){

            int n = target - nums[i];

            for(int j=0; j<=nums.length-1; j++){
                if(i != j && nums[j] == n){
                    return new int []{i, j};
                }
            }
        }
        return new int[]{};
    }
}